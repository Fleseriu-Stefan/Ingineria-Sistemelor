package lab10;
import java.util.Arrays;
import java.util.List;
public class Main2 {
    public static void main(String[] args){
        List<Student>studenti=Arrays.asList(
                new Student(1025,"Andrei","Popa","ISM141/2", 8.70),
                new Student(1024,"Ioan","Mihalcea","ISM141/1", 10),
                new Student(1026,"Anamaria","Prodan","TI131/1", 8.90),
                new Student(1029,"Bianca","Popescu","TI131/1", 10),
                new Student(1030,"Maria","Pana","TI131/2", 4.10),
                new Student(1031,"Gabriela","Mohanu","TI131/2", 7.33),
                new Student(1032,"Marius","Nasta","TI131/2", 3.20),
                new Student(1033,"Marius","Nasta","TI131/1", 5.12),
                new Student(1034,"Andrei","Dobrescu","TI131/2", 2.22)
        );
        List<IStudentExport> strategii=Arrays.asList(
          new StudentiInConsola(),
          new StudentiInFisierText("studentiDecorator.txt")
        );
        for(IStudentExport strategie:strategii){
            TimeExecutionDecorator decorator=new TimeExecutionDecorator(strategie,studenti);

            decorator.executionTime();
        }
    }
}
