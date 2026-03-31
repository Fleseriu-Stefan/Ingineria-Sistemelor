package lab5;

public class Main {
    public static void main(String[] args){
        //a
        IntCalculator calculator=new IntCalculator(10);
        int result=calculator.aduna(7).scade(4).inmulteste(3).rezultat();
        System.out.println(result);
        //b
        AdvancedCalculator advancedCalculator=new AdvancedCalculator(10);
        int result2= advancedCalculator.imparte(4).putere(2).radacina(2).rezultat();
        System.out.println(result2);
    }
}
