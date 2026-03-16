package lab2;

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
}
