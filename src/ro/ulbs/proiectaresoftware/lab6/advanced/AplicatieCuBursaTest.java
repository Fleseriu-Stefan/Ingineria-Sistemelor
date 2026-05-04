package ro.ulbs.proiectaresoftware.lab6.advanced;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class AplicatieCuBursaTest {
    @Test
    public void sortTest1() {

        AplicatieCuBursa app = new AplicatieCuBursa();

        List<StudentBursier> lista = app.genereaza();
        List<StudentBursier> sortata = app.sorteaza(lista);

        for (int i = 0; i < sortata.size() - 1; i++) {

            StudentBursier s1 = sortata.get(i);
            StudentBursier s2 = sortata.get(i + 1);

            boolean ok =
                    s1.getFormatieDeStudiu().compareTo(s2.getFormatieDeStudiu()) <= 0;

            assertTrue(ok);
        }
    }
}
