package fr.epsi.junit;

import org.junit.jupiter.api.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    public static void initGlobal(){
        System.out.println("======================");
        System.out.println("Init globale");
    }

    @BeforeEach
    public void init(){
        System.out.println("======================");
        System.out.println("Init apres chaque test");
        this.calculator = new Calculator();
    }

    @Test
    public void should_add_two_numbers(){
        int a = 8;
        int b = 6;
        int result = a + b;
        Assertions.assertEquals(result, calculator.add(a, b));
    }

    @Test
    public void should_substract_two_numbers(){
        int a = 8;
        int b = 6;
        int result = a - b;
        Assertions.assertEquals(result, calculator.substract(a, b));
    }

    @Test
    public void should_multi_two_numbers(){
        int a = 8;
        int b = 6;
        int result = a * b;
        Assertions.assertEquals(result, calculator.multi(a, b));
    }

    @Test
    public void should_div_two_numbers(){
        int a = 8;
        int b = 6;
        int result = a / b;
        Assertions.assertEquals(result, calculator.div(a, b));
    }

    @Test
    public void should_sum_numbers_in_tab(){
        int[] numbers = { 10, 5, 8, 7, 2 };

        Assertions.assertEquals(32, calculator.add(numbers));
    }

    @AfterEach
    public void cleanEach(){
        System.out.println("Nettoyage apres chaque test");
        System.out.println("----------------------");
    }

    @AfterAll
    public static void cleanGlobal(){
        System.out.println("Nettoyage globale");
        System.out.println("======================");
    }
}
