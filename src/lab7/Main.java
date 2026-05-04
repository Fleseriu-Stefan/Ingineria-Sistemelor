package lab7;
import lab7.forms.Circle;
import lab7.forms.Form;
import lab7.forms.Square;
import lab7.forms.Triangle;
import lab7.util.PasswordMaker;
import java.util.LinkedHashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {

        Triangle tri = new Triangle(1.1F, 2.0F, "red");
        Circle c = new Circle(1.5F, "yellow");
        Square sq = new Square(1.2F, "blue");

        System.out.println("Area = " + tri.getArea() + " details: " + tri);
        System.out.println("Area = " + c.getArea() + " details: " + c);
        System.out.println("Area = " + sq.getArea() + " details: " + sq);

        System.out.println("Total instance count is " + Form.getInstanceCount());
        PasswordMaker pm2 = PasswordMaker.getInstance();

        System.out.println("\n7.6.2 Generated passwords:");
        System.out.println("1: " + PasswordMaker.getInstance().getPassword());
        System.out.println("2: " + PasswordMaker.getInstance().getPassword());
        System.out.println("3: " + PasswordMaker.getInstance().getPassword());
        System.out.println("4: " + pm2.getPassword());
        System.out.println("5: " + pm2.getPassword());

        System.out.println("\nNumber of times getInstance() was called: "
                + PasswordMaker.getCallingCounts());
        Set<Student> studenti = new LinkedHashSet<>();

        studenti.add(new Student(1, "Andrei", "Popa", "TI 211"));
        studenti.add(new Student(2, "Ioana", "Mihai", "TI 211"));
        studenti.add(new Student(3, "Bianca", "Ionescu", "TI 211"));
        studenti.add(new Student(4, "Radu", "Dumitru", "TI 211"));
        studenti.add(new Student(5, "Maria", "Stan", "TI 211"));

        studenti = imparteInDouaFormatii(studenti, "TI 211_1", "TI 211_2");

        System.out.println("\n7.6.3 Studenti impartiti in doua formatii:");
        for (Student student : studenti) {
            System.out.println(student);
        }
    }
    static Student schimbaFormatia(Student st, String nouaFormatieDeStudiu) {
        return new Student(
                st.getNumarMatricol(),
                st.getPrenume(),
                st.getNume(),
                nouaFormatieDeStudiu
        );
    }

    static Set<Student> imparteInDouaFormatii(Set<Student> studenti,
                                              String formatia1,
                                              String formatia2) {
        Set<Student> rezultat = new LinkedHashSet<>();

        int limitaPrimaFormatie = (studenti.size() + 1) / 2;
        int index = 0;

        for (Student student : studenti) {
            if (index < limitaPrimaFormatie) {
                rezultat.add(schimbaFormatia(student, formatia1));
            } else {
                rezultat.add(schimbaFormatia(student, formatia2));
            }

            index++;
        }

        return rezultat;
    }
}
