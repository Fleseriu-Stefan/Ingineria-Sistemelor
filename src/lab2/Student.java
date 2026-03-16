package lab2;
import java.util.Objects;
public class Student {
    int id;
    String prenume;
    String nume;
    String formatieDeStudiu;
    public Student(int id,String prenume,String nume,String formatieDeStudiu){
        this.id=id;
        this.prenume=prenume;
        this.nume=nume;
        this.formatieDeStudiu=formatieDeStudiu;
    }
    public String toString(){
        return id+" "+prenume+" "+nume+" "+formatieDeStudiu;
    }
    public boolean equals(Object o){
        if(this==o)return true;
        if(!(o instanceof Student))return false;
        Student student=(Student) o;
        return prenume.equals(student.prenume)&&nume.equals(student.nume)&&formatieDeStudiu.equals(student.formatieDeStudiu);
    }
    public int hashCode(){
        return Objects.hash(prenume,nume,formatieDeStudiu);
    }
}
