package main;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Lesson 18 - Wrapper Class
		 */
		
		System.out.println("Lesson 18 - Wrapper Class");
		
		Boolean a = true;
		Character b = '@';
		Integer c = 1410;
		Double d = 1.6;
		
		// autoboxing: assigning primitive to wrapper
		a = false;
		
		// unboxing: converting wrapper to primitive
		if(!a)
			System.out.println("a == false");
		
		
		/*
		 * Lesson 19 - Array list
		 */
		
		System.out.println("\nLesson 19 - Array list");
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Ford");
		cars.add("Toyota");
		cars.add("Tesla");
		
//		cars.set(0, "Skoda");
//		cars.remove(2);
//		cars.clear();
		
		for(int i = 0; i < cars.size(); i++)
			System.out.println(cars.get(i));
		
		
		/*
		 * Lesson 20 - 2D Array list
		 */
		
		System.out.println("\nLesson 20 - 2D Array list");
		
		ArrayList<String> meats = new ArrayList<>();
		ArrayList<String> fruits = new ArrayList<>();
		ArrayList<String> vegetables = new ArrayList<>();
		
		ArrayList<ArrayList<String>> groceries = new ArrayList<>();
		
		meats.add("Pork");
		meats.add("Beef");
		
		fruits.add("Blueberries");
		fruits.add("Bananas");
		
		vegetables.add("Broccoli");
		vegetables.add("Garlic");
		
		groceries.add(meats);
		groceries.add(fruits);
		groceries.add(vegetables);
		
		System.out.println(groceries.get(0));
		
		groceries.get(0).add("Eggs");
		
		// Operates on original values, not on copies		
		System.out.println(groceries.get(0));
		System.out.println(meats);
		
		
		/*
		 * Lesson 21 - For-each loop
		 */
		
		System.out.println("\nLesson 21 - For-each loop");
		
		for(String i : cars)
			System.out.println(i);
		
		/*
		 * Lesson 22 - Methods
		 */
		
		System.out.println("\nLesson 22 - Methods");
		
		int a22 = 2;
		int b22 = 2;
		int c22 = add(a22, b22);
		
		System.out.println("a + b = " + c22);
		
		/*
		 * Lesson 23 - Overloaded methods
		 */
		
		System.out.println("\nLesson 23 - Overloaded methods");
		
		int a23 = 7;
		int b23 = 9;
		int c23 = 13;
		double d23 = 2.96;
		double e23 = 0.18;
		double f23 = 1.29;
		
		System.out.println("a + b = " + sum(a23, b23));
		System.out.println("a + b + c = " + sum(a23, b23, c23));
		System.out.println("d + e = " + sum(d23, e23));
		System.out.println("d + e + f = " + sum(d23, e23, f23));
		
		
		/*
		 * Lesson 24 - printf
		 */
		
		System.out.println("\nLesson 24 - printf");
		
		// % [flags] [precision] [width] [conversion-character]
		
		boolean bool24 = true;
		char char24 = '@';
		int int24 = 26;
		double d24 = 1013.37;
		double e24 = 10000000;
		String s24 = "Reclaimer of his name";
		
		// conversion-characters
		System.out.printf("%b, %c, %d, %f, %s\n", bool24, char24, int24, d24, s24);
		// width
		System.out.printf("Hello %10s\n", s24);
		// precision
		System.out.printf("Money: %.2f, %.4f", d24, d24);
		// flags
		// -  :  left-justify
		// +  :  output '+' or '-' based on values sign
		// 0  :  numeric values are zero padded
		// ,  :  grouping separator if number > 1000
		System.out.printf("Hello %-10s, %d\n", s24, int24);
		System.out.printf("%+f\n", d24);
		// flag '0' requires 'width' field
		System.out.printf("%020f\n", d24);
		System.out.printf("%,.2f\n", e24);
		
		
		/*
		 * Lesson 25 - final keyword
		 */
		
		System.out.println("\nLesson 25 - final keyword");
		
		// Value cannot be modified (named using upper case)
		final double PI = 3.14159;
		
		System.out.println(PI);
		
	}
	
	/*
	 * Lesson 22 - Methods
	 */
	
	static int add(int a, int b) {
		return a + b;
	}
	
	/*
	 * Lesson 23 - Overloaded methods
	 */
	
	static int sum(int a, int b) {
		return a + b;
	}
	
	static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	static double sum(double a, double b) {
		return a + b;
	}

	static double sum(double a, double b, double c) {
		return a + b + c;
	}

}
