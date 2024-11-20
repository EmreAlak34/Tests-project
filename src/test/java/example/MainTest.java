package example;

import example.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class  MainTest {

    @Test
     void testSum() {
        Assertions.assertEquals(5, Main.sum(2, 3), "Sum should be 5");
        Assertions.assertEquals(-1, Main.sum(-2, 1), "Sum should be -1");
    }
    @Test
     void testIsEven() {
        Assertions.assertTrue(Main.isEven(4), "4 should be even");
        Assertions.assertFalse(Main.isEven(3), "3 should not be even");
    }

    @Test
    public void testProduct() {
        Assertions.assertEquals(6, Main.product(2, 3), "Product should be 6");
        Assertions.assertEquals(0, Main.product(0, 5), "Product should be 0");
    }

    @Test
    void test_toUppercase(){

        String actual = Main.toUppercase("hello world");
        String expeacted = "HELLO WORLD";
        Assertions.assertEquals(expeacted, actual);
    }

    @Test
    public void testIsPositive() {
        Assertions.assertTrue(Main.isPositive(5), "5 should be positive");
        Assertions.assertFalse(Main.isPositive(-3), "-3 should not be positive");
        Assertions.assertFalse(Main.isPositive(0), "0 should not be positive");
    }

    }


