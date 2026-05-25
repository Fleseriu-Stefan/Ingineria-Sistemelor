package lab10;

import java.sql.Time;
import java.util.List;

public class TimeExecutionDecorator extends TimeExecution {
    private List<Student> studenti;
    public TimeExecutionDecorator(IStudentExport exporter,List<Student>studenti){
        super(exporter);
        this.studenti=studenti;
    }
    public long executionTime(){
        long timp=super.executionTime(studenti);
        System.out.println("Execution time:"+timp);
        return timp;
    }
}
