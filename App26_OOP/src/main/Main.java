package main;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Lesson 26 - Basics of classes
		 */
		
		System.out.println("Lesson 26 - Basics of classes");
		
		Car car = new Car();
		
		System.out.println(car.make);
		System.out.println(car.model);
		car.drive();
		car.brake();
		
		
		/*
		 * Lesson 27 - Constructors
		 */
		
		System.out.println("\nLesson 27 - Constructors");
		
		Human human1 = new Human("Vergil", 36, 78);
		Human human2 = new Human("Dante", 36, 82);
		
		System.out.println(human1.name);
		System.out.println(human2.name);
		human1.drink();
		human2.eat();

	}

}
