package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class calculatorTest {





        Calculator calculator;

        @Before
        public void setUip() throws Exception {
            calculator = new Calculator();
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

            Assert.assertEquals(0, calculator.minus(2, 2));
        }

        @Test
        public void multiply() {
            Assert.assertEquals(4, calculator.multiply(2, 2));
        }


    @Test
    public void testdivide() {
        int result = calculator.divide(8, 2);
        if (result != 4) {
            Assert.fail();
        }
    }

        @Test
        public void minElement() {
            int tab[] = {
                    2, 4, 6, 7
            };
            int a = calculator.minElement(tab);
            Assert.assertEquals(2, a);

        }

        @Test
        public void maxElement() {
            int tab[] = {
                    2, 4, 7, 8
            };
            int a = calculator.maxElement(tab);
            Assert.assertEquals(8, a);

        }


    }
