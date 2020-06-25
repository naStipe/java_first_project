package com.company;

import java.util.Scanner;

public class MathOperations {
    public static void Addition(){
        float a, b, res;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first value:");
        a = scan.nextFloat();
        System.out.println("Input second value:");
        b = scan.nextFloat();
        res = a + b;
        System.out.println("The sum is " + res);
    }

    public static void Subtraction(){
        float a, b, res;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first value:");
        a = scan.nextFloat();
        System.out.println("Input second value:");
        b = scan.nextFloat();
        res = a - b;
        System.out.println("The  is " + res);
    }
    
    public static void Division(){
        float number1, number2;
        String result;

        Scanner input = new Scanner(System.in);
        System.out.println("Input first value:");
        number1 = input.nextFloat();
        System.out.println("Input second value:");
        number2 = input.nextFloat();
        result = Float.toString(number1/number2);
        System.out.println("Result is " + result);

    }

    public static void Multiplication(){
        float number1, number2;
        String result;

        Scanner input = new Scanner(System.in);
        System.out.println("Input first value:");
        number1 = input.nextFloat();
        System.out.println("Input second value:");
        number2 = input.nextFloat();
        result = Float.toString(number1*number2);
        System.out.println("Result is " + result);
    }
}
