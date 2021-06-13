package testcases;

import com.example.Gebruiker;
import com.example.Kookboek;
import com.example.Recept;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

//import static org.junit.jupiter.api.Assertions.;

public class GebruikerTest {

    @Test
    public void getAccountGegevens() {
        Kookboek kookboek = new Kookboek("nieuw kookboek");
        Gebruiker gebruiker = new Gebruiker("Kees", "a", kookboek);
        Assert.assertEquals("Kees", gebruiker.getGebruikersnaam());
        Assert.assertEquals("a", gebruiker.getWachtwoord());
        Assert.assertTrue( gebruiker.isWachtwoordCorrect("a"));
        Assert.assertFalse( gebruiker.isWachtwoordCorrect("b"));
    }
}