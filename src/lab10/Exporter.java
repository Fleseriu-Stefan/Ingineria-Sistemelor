package lab10;
import java.util.List;
public class Exporter {
    public void startExport(IStudentExport strategy,
                           List<Student> studenti) {

        strategy.doExport(studenti);
    }
}
