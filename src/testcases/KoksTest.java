package testcases;

import com.example.*;
import org.junit.Assert;
import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.;

public class KoksTest {

    @Test
    public void getBereidingswijze() {
        Recept recept = new Recept("naam", "ingredienten", "Koken");
        Recept recept2 = new Recept("naam", "ingredienten", "Stomen");
        Kok kok;
        if(recept.getBereidingswijze().equals("Koken")){
            kok = new StoomKok("geert");
        }
        else{
            kok = new KookKok("Bert");
        }
        Assert.assertEquals("naam wordt gestoomd", kok.klaarmaken(recept));
        Assert.assertEquals("naam wordt gekookt", kok.klaarmaken(recept2));
    }
}