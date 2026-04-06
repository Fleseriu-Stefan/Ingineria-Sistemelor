package lab5.p452;

public class Main {
    public static void main(String[] args) {
        NewIntCalculator calculator = new NewIntCalculator(10);
        int result = (Integer) calculator.aduna(5).scade(3).inmulteste(2).result();
        System.out.println(result);
        DoubleCalculator Calculator=new DoubleCalculator(10.0);
        double result2=(Double) Calculator.aduna(5.0).scade(3.3).inmulteste(2.2).result();
        System.out.println(result2);
    }
}
