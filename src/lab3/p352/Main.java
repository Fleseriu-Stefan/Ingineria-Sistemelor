package lab3.p352;
import lab2.Student;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
public class Main {
    public static void main(String[] args){
        try{
            Path inputPath=Paths.get("studenti_in.txt");
            Path outputPath=Paths.get("studenti_out.txt");
            List<String>linii=Files.readAllLines(inputPath);
            List<Student>studenti=new ArrayList<>();
            for(String linie:linii){
                String[] campuri=linie.split(",");
                int id=Integer.parseInt(campuri[0]);
                String prenume=campuri[1];
                String nume=campuri[2];
                String grupa=campuri[3];
                Student s=new Student(id,prenume,nume,grupa);
                studenti.add(s);
            }
            System.out.println("Studenti cititi:");
            for (Student s:studenti){
                System.out.println(s);
            }
            Collections.sort(studenti,new Comparator<Student>(){
                public int compare(Student s1,Student s2){
                    return s1.getnume().compareTo(s2.getnume());
                }
            });
            System.out.println("\n studenti sortati dupa nume");
            for(Student s:studenti){
                System.out.println(s);
            }
            List<String> output=new ArrayList<>();
            for(Student s:studenti){
                output.add(s.toString());
            }
            Files.write(outputPath,output);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
