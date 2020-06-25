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
        res = a * b;
        System.out.println("The  is " + res);
    }
}
