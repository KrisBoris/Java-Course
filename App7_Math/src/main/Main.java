package main;

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
	}

}
