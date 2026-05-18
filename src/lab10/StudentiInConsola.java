package lab10;
import java.util.List;
public class StudentiInConsola implements IStudentExport {

    public void doExport(List<Student> studenti) {

        for(Student s : studenti) {
            System.out.println(s);
        }

    }
}
