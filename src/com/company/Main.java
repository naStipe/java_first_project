package com.company;

public class Main {

	public static Boolean toContinue = true;
	public static String request;

	public static void main(String[] args) {
		System.out.println("Welcome to the calculator!");

		while (toContinue) {
			showMenu();
			request = System.in.toString();
			switch (request) {
				case "Add":
					//Addition();
					break;
				case "Sub":
					//Subtraction();
					break;
				case "Mult":
					//Multiplication();
					break;
				case "Div":
					//Division();
					break;
				case "Exit":
					toContinue = false;
			}
		}
	}

	public static void showMenu(){
		System.out.println("Choose operation that you wold like to proceed(Type what is in brackets):");
		System.out.println("	Addition(Add)");
		System.out.println("	Subtraction(Sub)");
		System.out.println("	Multiplication(Mult)");
		System.out.println("	Division(Div)");
		System.out.println("	Exit Program(Exit)");
	}

	public static float Addition(){
		float a, b, res;
		System.out.println("Input first value:");
		//a = System.in.;
		//res = a + b;

		return 0;
	}

}
