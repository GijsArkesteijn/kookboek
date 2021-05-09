package testcases;

import com.example.Kookboek;
import com.example.Recept;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

//import static org.junit.jupiter.api.Assertions.;

public class AccountTest {

    @Test
    public void getAangemaakteRecept() {
        Kookboek kookboek = new Kookboek("nieuw kookboek");
        Assert.assertEquals("Uw account is gratis aan te maken", kookboek.accountVoorwaarden(0));
        Assert.assertEquals("Uw account is gratis aan te maken", kookboek.accountVoorwaarden(1));
        Assert.assertEquals("Uw account is gratis aan te maken", kookboek.accountVoorwaarden(7));
        Assert.assertEquals("Uw account is gratis aan te maken", kookboek.accountVoorwaarden(8));
        Assert.assertEquals("Uw Account kost 2,50", kookboek.accountVoorwaarden(9));
        Assert.assertEquals("Uw Account kost 2,50", kookboek.accountVoorwaarden(17));
        Assert.assertEquals("Uw Account kost 5,00", kookboek.accountVoorwaarden(18));
        Assert.assertEquals("Uw Account kost 5,00", kookboek.accountVoorwaarden(19));
    }
}