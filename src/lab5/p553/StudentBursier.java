package lab5.p553;
import lab2.Student;
import java.util.Objects;

public class StudentBursier extends Student{
    private double cuantumBursa;
    public StudentBursier(int id,String prenume,String nume,String formatieDeStudiu,double cuantumBursa){
        super(id,prenume,nume,formatieDeStudiu);
        this.cuantumBursa=cuantumBursa;
    }
    public double getCuantumBursa(){
        return cuantumBursa;
    }
    public void setCuantumBursa(double cuantumBursa){
        this.cuantumBursa=cuantumBursa;
    }
    public boolean equals(Object o){
        if(this==o)return true;
        if(!(o instanceof StudentBursier))return false;
        if(!super.equals(o))return false;
        StudentBursier that=(StudentBursier) o;
        return Double.compare(that.cuantumBursa,cuantumBursa)==0;
    }
    public int hashCode(){
        return Objects.hash(super.hashCode(),cuantumBursa);
    }
    public String toString(){
        return super.toString()+" cuantumBursa="+cuantumBursa;
    }
}
