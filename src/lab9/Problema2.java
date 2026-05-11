package lab9;
import java.util.*;
import java.util.stream.*;
public class Problema2 {
    public static void main(String[] args) {
        String text = "Acesta este un program scris in java pentru expresii lambda";

        List<String> cuvinte = Arrays.asList(text.split(" "));
        System.out.println("Cuvinte: " + cuvinte);

        List<String> filtrate = cuvinte.stream()
                .filter(c -> c.length() >= 5)
                .collect(Collectors.toList());

        System.out.println("Cuvinte cu lungime >= 5: " + filtrate);
        System.out.println("Numar cuvinte: " + filtrate.size());

        List<String> sortate = filtrate.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Cuvinte sortate: " + sortate);

        Optional<String> cuvantCuP = cuvinte.stream()
                .filter(c -> c.startsWith("p"))
                .findFirst();

        cuvantCuP.ifPresent(c -> System.out.println("Cuvant care incepe cu p: " + c));
    }
}
