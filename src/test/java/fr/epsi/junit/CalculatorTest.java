package fr.epsi.junit;

import org.junit.jupiter.api.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    public static void init(){
        System.out.println("======================");
        System.out.println("Init globale");
    }

    @Test
    public void should_add_two_numbers(){
        int a = 5;
        int b = 6;
        int result = a + b;
        Assertions.assertEquals(result, Calculator.add(a, b));
    }

    @Test
    public void should_substract_two_numbers(){
        int a = 8;
        int b = 6;
        int result = a - b;
        Assertions.assertEquals(result, Calculator.substract(a, b));
    }


}
