
import static org.junit.Assert.*;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator;
    @Before
    public void setUip() throws Exception{
        calculator=new Calculator();
    }

    @Test
    public void testsum() {
        int resultat = calculator.sum(2, 2);
        if (resultat != 4) {
            Assert.fail();
        }
    }



    @Test
    public void minus() {

        Assert.assertEquals(0, calculator.minus(2,2));
    }

    @Test
    public void multiply() {
        Assert.assertEquals(4, calculator.multiply(2,2));
    }



}


