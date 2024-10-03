package main;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Lesson 7 - Math		
		 */
		System.out.println("Lesson 7 - Math");
		
		double x = 21.3;
		double y = -32.1;
		
		System.out.println("Max: " + Math.max(x, y) + ", Min: " + Math.min(x, y));
		System.out.println("Abs:" + Math.abs(y));
		System.out.println("Sqrt: " + Math.sqrt(x));
		System.out.println("Round: " + Math.round(x));
		System.out.println("Flour: " + Math.floor(y));
		System.out.println("Ceil: " + Math.ceil(y));
		
		
		/*
		 * Lesson 8 - Random numbers
		 */
		System.out.println("\nLesson 8 - Random numbers");
		
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		
		int rand_int = random.nextInt(6) + 1;
		double rand_double = random.nextDouble(10);
		boolean rand_bool = random.nextBoolean();		
		
		System.out.println("Random int: " + rand_int);
		System.out.println("Random double: " + rand_double);
		System.out.println("Random boolean: " + rand_bool);
		
		
		/*
		 * Lesson 9 - If statements
		 */
		
		System.out.println("\nLesson 9 - If statements");
		
		if(rand_int > 3)
			System.out.println("Critical hit!");
		else if(rand_int <= 3 && rand_int > 1)
			System.out.println("Miss...");
		else
			System.out.println("Critical failure!");
		
		
		/*
		 * Lesson 10 - Switch-case
		 */
		
		System.out.println("\nLesson 10 - Switch-case");
		
		int grade = random.nextInt(2, 6);
				
		switch(grade) {
			case 2: System.out.println(grade + " - You are adopted");
			break;
			case 3: System.out.println(grade + " - You are our greatest failure");
			break;
			case 4: System.out.println(grade + " - When I was your age...");
			break;
			case 5: System.out.println(grade + " - I can tolerate it");
			break;
		}
		
		
		/*
		 * Lesson 11 - Logical operators
		 */
		
		System.out.println("\nLesson 11 - Logical operators");
		
		int temperature = random.nextInt(-10, 33);
		System.out.println("Temperature: " + temperature);
		
		if(temperature > 25 && temperature <= 30)
			System.out.println("It is very hot outside");
		else if(temperature <= 25 && temperature > 10)
			System.out.println("It is warm outside");
		else if(temperature < 10 && temperature >= -5)
			System.out.println("It is cold outside");
		else if(temperature > 30 || temperature < -5)
			System.out.println("THe global warming is real");
		
		
		/*
		 * Lesson 12 - While loop
		 */
		
		System.out.println("\nLesson 12 - While loop");
		
		Scanner scanner = new Scanner(System.in);
		String name12 = "there";	// To skip input entering, normally string is empty
		
		while(name12.isBlank()) {
			System.out.print("Enter your name: ");
			name12 = scanner.nextLine();
		}
		
		System.out.println("Hello " + name12);
		
		
		/*
		 * Lesson 13 - For loop
		 */
		
		System.out.println("\nLesson 13 - For loop");
		
		for(int i = 10; i >= 0; i -= 2)
			System.out.println(i);
		System.out.println("Happy New Year!");
		
		
		/*
		 * Lesson 14 - Nested for loop
		 */
		
		System.out.println("\nLesson 14 - Nested for loop");
		
		char symbol = '#';
		int rows = 5;
		int columns = 4;
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++)
				System.out.print(symbol);
			System.out.println();
		}
		
		
		/*
		 * Lesson 15 - Arrays
		 */
		
		System.out.println("\nLesson 15 - Arrays");
		
//		String[] cars = {"Ford, Toyota, Tesla"};
		String[] cars = new String[3];
		
		cars[0] = "Ford";
		cars[1] = "Toyota";
		cars[2] = "Tesla";
		
		for(int i = 0; i < cars.length; i++)
			System.out.println(cars[i]);
	
		
		/*
		 * Lesson 16 - 2D Arrays
		 */
		
		System.out.println("\nLesson 16 - 2D Arrays");
		
		String[][] cars16 = { {"Tesla", "Toyota", "Ford"}, 
				{"Ferrari", "Lamborghini", "Bugatti"}, 
				{"Fiat", "Polonez", "Syrenka"} };
		
		for(int i = 0; i < cars16.length; i++) {
			for(int j = 0; j < cars16[i].length; j++)
				System.out.print(cars16[i][j] + ", ");
			System.out.println();
		}
		
		
		/*
		 * Lesson 17 - String class methods
		 */
		
		System.out.println("\nLesson 17 - String class methods");
		
		String name = "Storm that is approaching";
		boolean equals = name.equals("Vergil");	// false (case sensitive)
		boolean equalsNonCaseSens = name.equalsIgnoreCase("Vergil");	// false
		int length = name.length();	// Counts white spaces
		char charAt = name.charAt(0);
		int indexOf = name.indexOf('S');	// returns -1 if not found
		boolean isEmpty = name.isEmpty();
		String upCase = name.toUpperCase();
		String lowCase = name.toLowerCase();
		String trim = name.trim();	// Empty space from beginning and end of the string
		String replace = name.replace('o', 'u');
		
		System.out.println(replace);
		
	}

}
