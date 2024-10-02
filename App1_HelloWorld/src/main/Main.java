package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Lesson 1
		 * Serial output
		 */
		
		System.out.println("Lesson 1 - System output");
		System.out.println("\t\"Zmitac is love\"");
		System.out.println("- Drabcio, probably...");

		// Press ctrl + space to auto generate from "sysout" to "System.out.println()"
		// System.out.println();
		
		// Coment comment coment comment

		/*
		 * Lesson 2
		 * Variables
		 */
		
		byte a = (byte)127;	// 1 byte
		short b = 4096;	// 2 bytes
		int c = 213;	// 4 bytes
		long d = 1000L;	// 8 bytes
		float e = 3.14f;	// 4 bytes, 7 digits
		double f = 3.14159;	// 8 bytes, 15 digits
		
		char g = 'g';	// 2 bytes
		String h = "Ala ma kota";
		
		System.out.println("\nLesson 2 - Variables");
		System.out.println(a);
		
		/*
		 * Lesson 3
		 * Swap two variables
		 */
		
		String x = "water";
		String y = "vodka";
		String temp = "";
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("\nLesson 3 - Swap variables");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		/*
		 * Lesson 4 - Standard input
		 */
		
		System.out.println("\nLesson 4 - User input");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		scanner.nextLine();	// Remove \n from the scanner
		
		System.out.println("What is your favourite color?");
		String color = scanner.nextLine();
		
		System.out.println("Your name is " + name);
		System.out.println("You are " + age + " years old");
		System.out.println("Your favourite color is " + color);
		
		/*
		 * Lesson 5 - Expressions
		 */
		
		System.out.println("\nLesson 5 - Expressions");
		
		int friends = 10;
		friends++;
		double coworkers = (double) friends / 3;
		
		System.out.println("Coworkers: " + coworkers);
	}

}
