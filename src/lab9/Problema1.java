package lab9;
import java.util.*;
import java.util.stream.*;

public class Problema1 {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> numere = IntStream.range(0, 10)
                .map(i -> 5 + random.nextInt(21)) // [5..25]
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Lista: " + numere);

        int suma = numere.stream().mapToInt(n -> n).sum();
        System.out.println("Suma: " + suma);

        int maxim = numere.stream().max(Comparator.naturalOrder()).get();
        int minim = numere.stream().min(Comparator.naturalOrder()).get();

        System.out.println("Maxim: " + maxim);
        System.out.println("Minim: " + minim);

        List<Integer> interval = numere.stream()
                .filter(n -> n >= 10 && n <= 20)
                .collect(Collectors.toList());

        System.out.println("Numere in intervalul [10..20]: " + interval);

        List<Double> valoriDouble = numere.stream()
                .map(n -> Double.valueOf(n))
                .collect(Collectors.toList());

        System.out.println("Lista Double: " + valoriDouble);

        boolean contine12 = numere.stream().anyMatch(n -> n == 12);
        System.out.println("Lista contine 12? " + contine12);
    }
}
