package lab9;

import lab2.Student;

import java.util.*;
import java.util.stream.Collectors;

public class Problema3 {
    public static void main(String[] args) {

        Map<Student, Double> studentiCuNote = new HashMap<>();

        studentiCuNote.put(new Student(1025, "Andrei", "Popa", "ISM141/2"), 8.70);
        studentiCuNote.put(new Student(1024, "Ioan", "Mihalcea", "ISM141/1"), 10.0);
        studentiCuNote.put(new Student(1026, "Anamaria", "Prodan", "TI131/1"), 8.90);
        studentiCuNote.put(new Student(1029, "Bianca", "Popescu", "TI131/1"), 10.0);
        studentiCuNote.put(new Student(1030, "Maria", "Pana", "TI131/2"), 4.10);
        studentiCuNote.put(new Student(1031, "Gabriela", "Mohanu", "TI131/2"), 7.33);
        studentiCuNote.put(new Student(1032, "Marius", "Nasta", "TI131/2"), 3.20);
        studentiCuNote.put(new Student(1033, "Marius", "Nasta", "TI131/1"), 5.12);
        studentiCuNote.put(new Student(1034, "Andrei", "Dobrescu", "TI131/2"), 2.22);

        System.out.println("Studenti cu nota 10:");
        studentiCuNote.entrySet().stream()
                .filter(e -> e.getValue() == 10)
                .forEach(e -> System.out.println(e.getKey() + " nota=" + e.getValue()));

        System.out.println("\nStudenti cu nota sub 5:");
        studentiCuNote.entrySet().stream()
                .filter(e -> e.getValue() < 5)
                .forEach(e -> System.out.println(e.getKey() + " nota=" + e.getValue()));

        System.out.println("\nLista noua: studentii cu nota < 4 devin cu nota 4:");
        Map<Student, Double> listaNoua = studentiCuNote.entrySet().stream()
                .collect(Collectors.toMap(
                        e -> e.getKey(),
                        e -> e.getValue() < 4 ? 4.0 : e.getValue()
                ));

        listaNoua.forEach((student, nota) ->
                System.out.println(student + " nota=" + nota)
        );

        double suma = studentiCuNote.values().stream()
                .reduce(0.0, (a, b) -> a + b);

        System.out.println("\nSuma notelor: " + suma);

        double media = suma / studentiCuNote.size();

        System.out.println("Media notelor: " + media);
    }
}