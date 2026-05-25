package lab10;
import java.util.List;
public class TimeExecution implements ITimeExecution {
    private IStudentExport exporter;
    public TimeExecution(IStudentExport exporter){
        this.exporter=exporter;
    }
    @Override
    public long executionTime(List<Student>studenti){
        long start=System.currentTimeMillis();
        exporter.doExport(studenti);
        long end=System.currentTimeMillis();
        return end-start;
    }
}
