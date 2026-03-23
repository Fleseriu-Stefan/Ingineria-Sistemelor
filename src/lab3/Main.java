package lab3;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args){
        try{
            Path inputPath=Paths.get("in.txt");
            Path outputPath=Paths.get("out.txt");
            List<String> linii=Files.readAllLines(inputPath);
            //a
            List<String> rezultat1=new ArrayList<>();
            for(String linie : linii){
                rezultat1.add(linie+"\n");
            }
            System.out.println("a)");
            for(String s : rezultat1){
                System.out.println(s);
            }
            //b
            List<String> rezultat2=new ArrayList<>();
            for(String linie : linii){
                String[] propozitii=linie.split("\\.");
                for(String p : propozitii){
                    if(!p.trim().isEmpty()){
                        rezultat2.add(p.trim()+".\n");
                    }
                }
            }
            System.out.println("\n b)");
            for(String s : rezultat2){
                System.out.println(s);
            }
            //c
            List<String> outputLines=new ArrayList<>();
            outputLines.add("a)");
            outputLines.addAll(rezultat1);
            outputLines.add("b)");
            outputLines.addAll(rezultat2);
            Files.write(outputPath,outputLines);
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
