package fr.epsi.junit;

import java.sql.SQLOutput;

public class Calculator {

    public int add(int a, int b){
        return a + b;
    }

    public int multi(int a, int b){
        return a * b;
    }

    public int substract(int a, int b){
        return a - b;
    }

    public int div(int a, int b){
        return a / b;
    }

    public int addTab(int[] numbers, int index, int number){
        return numbers[index] = number;
    }
}
