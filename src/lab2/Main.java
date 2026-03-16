package lab2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Random;
public class Main {
    public static void main(String[] args){
        List<Integer>x=new ArrayList<>();
        List<Integer>y=new ArrayList<>();
        List<Integer>xPlusY=new ArrayList<>();
        Set<Integer>zSet=new TreeSet<>();
        List<Integer>xMinusY=new ArrayList<>();
        int p=4;
        List<Integer>xPlusYLimitedByP=new ArrayList<>();
        Random random=new Random();
        for(int i=0;i<5;i++){
            x.add(random.nextInt(11));
        }
        for(int i=0;i<7;i++){
            y.add(random.nextInt(11));
        }
        System.out.println("x="+x);
        System.out.println("y="+y);
        //a)
        xPlusY.addAll(x);
        xPlusY.addAll(y);
        System.out.println("x+y="+xPlusY);
        //b)
        for(Integer b : x){
            if(y.contains(b)){
                zSet.add(b);
            }
        }
        System.out.println("zSet="+zSet);
        //c)
        for(Integer c : x){
            if(!y.contains(c)){
                xMinusY.add(c);
            }
        }
        System.out.println("xMinusY="+xMinusY);
        //d)
        Set<Integer> tempSet=new TreeSet<>();
        for(Integer d : x){
            if(d<=p){
                tempSet.add(d);
            }
        }
        for(Integer d : y){
            if(d<=p){
                tempSet.add(d);
            }
        }
        xPlusYLimitedByP.addAll(tempSet);
        System.out.println("xPlusLimitedByP="+xPlusYLimitedByP);
//problema 2
        //a
        List<Student>studenti=new ArrayList<>();
        studenti.add(new Student(101, "Ana", "Popa", "TI21/1"));
        studenti.add(new Student(120, "Alis", "Popa", "TI21/2"));
        studenti.add(new Student(112, "Maria", "Popa", "TI21/1"));
        System.out.println("Lista studenti");
        for(Student s:studenti){
            System.out.println(s);
        }
        //b
        Student s1=new Student(120,"Alis","Popa","TI21/2");
        boolean exista1 = existaStudent(studenti,s1);
        System.out.println("Exista Alis Popa?"+exista1);
        //c
        Student s2=new Student(112,"Maria","Popa","TI21/1");
        boolean exista2 = existaStudent(studenti,s2);
        System.out.println("Exista Maria Popa?"+exista2);

    }
    //b si c
    public static boolean existaStudent(List<Student> lista,Student student){
        for(Student s:lista){
            if(s.prenume.equals(student.prenume)&&s.nume.equals(student.nume)&&s.formatieDeStudiu.equals(student.formatieDeStudiu)){
                return true;
            }
        }
        return false;
    }
}
