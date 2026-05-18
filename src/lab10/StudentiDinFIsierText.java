package lab10;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class StudentiDinFIsierText implements IStudentiImport{
    private String fileName;

    public StudentiDinFIsierText(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Student> doImport() {

        List<Student> studenti = new ArrayList<>();

        try {

            BufferedReader reader =
                    new BufferedReader(
                            new FileReader(fileName));

            String line;

            while((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                Student s = new Student(
                        Integer.parseInt(data[0]),
                        data[1],
                        data[2],
                        data[3],
                        Double.parseDouble(data[4])
                );

                studenti.add(s);
            }

            reader.close();

        } catch (IOException e) {

            System.out.println("Eroare: " + e.getMessage());

        }

        return studenti;
    }
}
