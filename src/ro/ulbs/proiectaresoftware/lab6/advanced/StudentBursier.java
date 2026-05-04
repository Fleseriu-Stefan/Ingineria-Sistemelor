package ro.ulbs.proiectaresoftware.lab6.advanced;
import java.util.Objects;
public class StudentBursier {
    private int numarMatricol;
    private String prenume;
    private String nume;
    private String formatieDeStudiu;
    private double nota;
    private double cuantumBursa;

    public StudentBursier(int numarMatricol, String prenume, String nume,
                          String formatieDeStudiu, double nota, double bursa) {
        this.numarMatricol = numarMatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieDeStudiu;
        this.nota = nota;
        this.cuantumBursa = bursa;
    }

    public String getPrenume() { return prenume; }
    public String getNume() { return nume; }
    public String getFormatieDeStudiu() { return formatieDeStudiu; }
    public double getNota() { return nota; }
    public double getCuantumBursa() { return cuantumBursa; }

    @Override
    public String toString() {
        return numarMatricol + " " + prenume + " " + nume + " " +
                formatieDeStudiu + " " + nota + " " + cuantumBursa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentBursier)) return false;
        StudentBursier that = (StudentBursier) o;
        return numarMatricol == that.numarMatricol &&
                Double.compare(that.nota, nota) == 0 &&
                Double.compare(that.cuantumBursa, cuantumBursa) == 0 &&
                Objects.equals(prenume, that.prenume) &&
                Objects.equals(nume, that.nume) &&
                Objects.equals(formatieDeStudiu, that.formatieDeStudiu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numarMatricol, prenume, nume, formatieDeStudiu, nota, cuantumBursa);
    }
}
