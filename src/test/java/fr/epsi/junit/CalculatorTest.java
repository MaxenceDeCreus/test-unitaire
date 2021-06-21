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
    public void should_add_numbers_in_tab(){
        int[] numbers = new int[10];
        int number = 10;
        int index = 1;
        int result = numbers[index] = number;

        Assertions.assertEquals(result, calculator.addTab(numbers, index, number));
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
