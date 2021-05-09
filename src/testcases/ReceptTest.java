package testcases;

import com.example.Menu;
import com.example.Recept;
import org.junit.Assert;
import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.;

public class ReceptTest {

    @Test
    public void getAangemaakteRecept() {
        Recept boerenkool = new Recept("stamppot","aardappelen en nog meer dingen","gewoon koken enzo");
        Assert.assertEquals("Boerenkool",boerenkool.receptAanpassen("Boerenkool","1kg boerenkool, 1kg aardappelen, 100g spekjes","kook de aardappelen en boerenkool gaar. Bak daarna de spekjes voor 4 min"));
    }
}