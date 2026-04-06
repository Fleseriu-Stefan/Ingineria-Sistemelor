package lab5.p553;

import lab2.Student;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<StudentBursier> bursieri = new HashSet<>();

        bursieri.add(new StudentBursier(1025, "Andrei", "Popa", "ISM141/2", 725.50));
        bursieri.add(new StudentBursier(1024, "Ioan", "Mihalcea", "ISM141/1", 801.10));
        bursieri.add(new StudentBursier(1026, "Anamaria", "Prodan", "TI131/1", 745.50));
        bursieri.add(new StudentBursier(1029, "Bianca", "Popescu", "TI131/1", 780.80));

        writeToFile("bursieri_out.txt", bursieri);
    }

    public static void writeToFile(String filename, Collection<? extends Student> studenti) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
            for (Student s : studenti) {
                pw.println(s);
            }
        } catch (IOException e) {
            System.out.println("Eroare la scriere in fisier: " + e.getMessage());
        }
    }
}