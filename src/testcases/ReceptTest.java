package testcases;

import com.example.Kookboek;
import com.example.Recept;
import org.junit.Assert;
import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.;

public class ReceptTest {

    @Test
    public void getReceptenBekijken() {
        Kookboek kookboek = new Kookboek("Gijs zijn kookboek");
        Kookboek kookboek2 = new Kookboek("Kees zijn kookboek");
        Assert.assertEquals("1: kip met rijst\n" +
                "2: Recept naam\n" +
                "3: standaart recept\n", kookboek.getRecepten()
        );
        Assert.assertEquals("1: Vies\n" +
                "2: Smerig\n" +
                "3: standaart recept\n", kookboek2.getRecepten()
        );
    }
}