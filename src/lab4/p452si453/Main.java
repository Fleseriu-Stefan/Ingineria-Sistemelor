package lab4.p452si453;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        String fisierStudenti = "studenti.txt";
        String fisierNote = "note_anon.txt";

        try {
            //452
            HashMap<Integer, Student> tineri = citesteStudenti(fisierStudenti);
            citesteSiAlocaNote(fisierNote, tineri);

            System.out.println("Studentii cu note:");
            for (Map.Entry<Integer, Student> entry : tineri.entrySet()) {
                System.out.println(entry.getValue());
            }

            //453
            float notaM = gasesteNota("Bianca", "Popescu", tineri);
            float notaN = gasesteNota("Ioan", "Popa", tineri);

            System.out.println();
            System.out.println("Nota Bianca Popescu: " + notaM);
            System.out.println("Nota Ioan Popa: " + notaN);

        } catch (IOException e) {
            System.out.println("Eroare la citirea fisierelor: " + e.getMessage());
        }
    }

    public static HashMap<Integer, Student> citesteStudenti(String numeFisier) throws IOException {
        HashMap<Integer, Student> studentiMap = new HashMap<>();

        BufferedReader br = new BufferedReader(new FileReader(numeFisier));
        String linie;

        while ((linie = br.readLine()) != null) {
            String[] parti = linie.split(",");

            int nrMatricol = Integer.parseInt(parti[0].trim());
            String prenume = parti[1].trim();
            String nume = parti[2].trim();
            String grupa = parti[3].trim();

            Student student = new Student(nrMatricol, prenume, nume, grupa);
            studentiMap.put(nrMatricol, student);
        }

        br.close();
        return studentiMap;
    }

    public static void citesteSiAlocaNote(String numeFisier, HashMap<Integer, Student> tineri) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(numeFisier));
        String linie;

        while ((linie = br.readLine()) != null) {
            String[] parti = linie.split(",");

            int nrMatricol = Integer.parseInt(parti[0].trim());
            float nota = Float.parseFloat(parti[1].trim());

            Student student = tineri.get(nrMatricol);
            if (student != null) {
                student.setNota(nota);
            }
        }

        br.close();
    }

    public static float gasesteNota(String prenume, String nume, HashMap<Integer, Student> tineri) {
        HashMap<String, Student> cautareRapida = new HashMap<>();

        for (Student student : tineri.values()) {
            String cheie = student.getPrenume() + "-" + student.getNume();
            cautareRapida.put(cheie, student);
        }

        String cheieCautata = prenume + "-" + nume;
        Student studentGasit = cautareRapida.get(cheieCautata);

        if (studentGasit != null) {
            return studentGasit.getNota();
        }

        return 0;
    }
}
