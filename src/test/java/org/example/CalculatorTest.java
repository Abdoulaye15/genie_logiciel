package org.example;

import static org.junit.Assert.*;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
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
    public void testDivide(){
        Assert.assertEquals(5, calculator.divide(3,15));
        Assert.assertEquals(0, calculator.divide(5,0));
        //Assert.assertEquals(8, calculator.divide(8,1));

    }

    @Test
    public void multiply() {
        Assert.assertEquals(4, calculator.multiply(2,2));
        Assert.assertEquals(24, calculator.multiply(12,2));
    }

    @Test
    public void testMax() {
        int max1 = calculator.Max(2, -2);
        Assert.assertEquals(2, max1);

        int max2 = calculator.Max(9, 8);
        Assert.assertEquals(9, max2);

        int max3 = calculator.Max(9, 8);
        Assert.assertEquals(9, max3);

        int max4 = calculator.Max(9, 8);
        Assert.assertEquals(9, max4);

    }

    @Test

    public void testMinl(){
        int min1 = calculator.Min(20,10);
        if (min1 != 10) Assert.fail();

        int min2 = calculator.Min(98,18);
        if (min2 != 18) Assert.fail();

        int min3 = calculator.Min(8,1);
        if (min3 != 1) Assert.fail();

        int min4 = calculator.Min(100,40);
        if (min4 != 40) Assert.fail();

    }


    @Test
    @Ignore
    public void minElement() {
        int tab[]={
                2,4,6,7
        };
        int a=calculator.minElement(tab);
        Assert.assertEquals(2,a);

    }
    @Test
    @Ignore
    public void maxElement(){
        int tab[]={
                2,4,7,8
        };
        int a =calculator.maxElement(tab);
        Assert.assertEquals(8,a);

    }


}


