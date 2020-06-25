package com.company;

import java.util.Scanner;

public class Main {

	public static Boolean toContinue = true;
	public static String request;
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to the calculator!");

		while (toContinue) {
			showMenu();
			Scanner scan = new Scanner(System.in);
			request = scan.next();
			switch (request) {
				case "Add" -> MathOperations.Addition();
				case "Sub" -> MathOperations.Subtraction();
				case "Mult" -> MathOperations.Multiplication();
				case "Div" -> MathOperations.Division();
				case "Exit" -> toContinue = false;
				default -> System.out.println("Code-word is incorrect. Please, check the right one and try again");
			}
		}
		System.exit(0);
	}

	public static void showMenu(){
		System.out.println("Choose operation that you wold like to proceed(Type what is in brackets):");
		System.out.println("	Addition(Add)");
 		System.out.println("	Subtraction(Sub)");
		System.out.println("	Multiplication(Mult)");
		System.out.println("	Division(Div)");
		System.out.println("	Exit Program(Exit)");
	}


}
