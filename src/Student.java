public class Student {
    int numarmatricol;
    String prenume;
    String nume;
    String formatiedestudiu;
    public Student(int numarmatricol,String prenume,String nume,String formatiedestudiu){
        this.numarmatricol=numarmatricol;
        this.prenume=prenume;
        this.nume=nume;
        this.formatiedestudiu=formatiedestudiu;
    }
    public String toString(){
        return "Student: "+" "+numarmatricol+" "+prenume+" "+nume+" "+formatiedestudiu;
    }
}
