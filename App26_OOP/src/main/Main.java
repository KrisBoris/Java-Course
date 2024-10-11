package main;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

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
		
		
		/*
		 * Lesson 28 - Variable scope
		 */
		
		System.out.println("\nLesson 28 - Variable scope");
		
		// Local - declared inside a method; visible only there
		// Global - declared outside a method but within a class; visible to all parts of the class
		
		DiceRoller diceRoller = new DiceRoller();
		
		
		/*
		 * Lesson 29 - Overloaded constructors
		 */
		
		System.out.println("\nLesson 29 - Overloaded constructors");
		
		BerriedDelight berriedDelight = new BerriedDelight("Butter crust", "Vanilla cream", "Berries");
		
		berriedDelight.showComposition();
		
		
		/*
		 * Lesson 30 - toStirng method
		 */
		
		System.out.println("\nLesson 30 - toStirng method");
		
		System.out.println(car + "\n----------");
		System.out.println(car.toString());
		
		
		/*
		 * Lesson 31 - Array of objects
		 */
		
		System.out.println("\nLesson 31 - Array of objects");
		
		Human kowalski = new Human("Kowalski", 36, 12);
		Human rico = new Human("Rico", 33, 20);
		Human skipper = new Human("Skipper", 36, 16);
		
		// Operates on originals, not on copies
		Human[] penguins = { kowalski, rico, skipper };
		
//		skipper.name = "Chief";
		
		for(Human i : penguins)
			System.out.println(i.name);
		System.out.println(penguins[0].name);
		
		
		/*
		 * Lesson 32 - Object passing
		 */
		
		System.out.println("\nLesson 32 - Object passing");
		
		Unit unit = new Unit();
		
		unit.addMember(skipper);
		unit.addMember(kowalski);
		unit.addMember(rico);
		
		for(Human i : unit.members)
			System.out.println(i.name);
		
		
		/*
		 * Lesson 33 - Static keyword
		 */
		
		System.out.println("\nLesson 33 - Static keyword");
		
		// Static - a single copy of a variable/method is created and shared among all instances of the class
		
		Friend friend1 = new Friend("Eliot");
		System.out.println(Friend.numberOfFriends);
		
		Friend friend2 = new Friend("Darlene");
		System.out.println(Friend.numberOfFriends);
		
		
		/*
		 * Lesson 34 - Inheritance
		 */
		
		System.out.println("\nLesson 34 - Inheritance");
		
		Tank tank = new Tank("German", "Tiger", "SS", 4);
		Bike bike = new Bike("Abram", "A1", "Task Unit Bruiser", 3);
		
		tank.go();
		bike.stop();
		
		System.out.println("Operators in tank: " + tank.operators);
		System.out.println("Bike has " + bike.wheels + " wheels");
		
		
		/*
		 * Lesson 35 - Method overriding 
		 */
		
		System.out.println("\nLesson 35 - Method overriding");
		
		Vehicle vehicle = new Vehicle("N/A", "N/A");
		
		vehicle.go();
		tank.go();
		
		
		/*
		 * Lesson 36 - super keyword
		 */
		
		System.out.println("\nLesson 36 - super keyword");
		
		System.out.println(tank);
		System.out.println();
		System.out.println(bike);
		
		
		/*
		 * Lesson 37 - abstract keyword
		 */
		
		System.out.println("\nLesson 37 - abstract keyword");
		
//		AbstractVehicle absVehicle = new AbstractVehicle();
		AbstractCar absCar = new AbstractCar();
		
		absCar.go();
		
		/*
		 * Lesson 38 - Access modifiers
		 */
		
		/*
		 * 				class 	package 	subclass 	world
		 * public		Y		Y			Y			Y
		 * protected	Y		Y			Y			N
		 * no modifier	Y		Y			N			N
		 * private		Y		N			N			N
		 */
		
		System.out.println("\nLesson 38 - Access modifiers");
		
		// Unaccessible
//		System.out.println(absCar.pirv);
		
		System.out.println(absCar.prot);
		System.out.println(absCar.def);
		System.out.println(absCar.publ);
		
		
		/*
		 * Lesson 39 - Encapsulation 
		 */
		
		System.out.println("\nLesson 39 - Encapsulation ");
		
		EncapsCar enCar = new EncapsCar("DMC", "DeLorean", 1985);
		
		enCar.setYear(1987);
		System.out.println(enCar.getModel());			
		
		
		/*
		 * Lesson 40 - Copy objects 
		 */
		
		System.out.println("\nLesson 40 - Copy objects");
		
		EncapsCar enCar2 = new EncapsCar(enCar);
		
		System.out.println(enCar2.getMake());
		System.out.println(enCar2.getModel());
		System.out.println(enCar2.getYear());
		
		
		/*
		 * Lesson 41 - Interfaces
		 */
		
		System.out.println("\nLesson 41 - Interfaces");
		
		Bear bear = new Bear();
		Sheep sheep = new Sheep();
		Fish fish = new Fish();
		
		bear.hunt();
		sheep.run();
		fish.hunt();
		fish.run();
		
		
		/*
		 * Lesson 42 - Polymorphism
		 */
		
		System.out.println("\nLesson 42 - Polymorphism");
		
		Animal[] animals = { sheep, fish, bear };
		
		for(Animal Q : animals)
			Q.doTheRoar();
		
		
		/*
		 * Lesson 43 - Dynamic polymorphism
		 */
		
		System.out.println("\nLesson 43 - Dynamic polymorphism");
		
		Animal animal;
		
		Random random = new Random();
		int choice = random.nextInt(2);
		
		if(choice == 0) {
			animal = bear;
			animal.doTheRoar();
		}
		else if(choice == 1) {
			animal = sheep;
			animal.doTheRoar();
		}
		
		
		/*
		 * Lesson 44 - Exceptions
		 */
		
		System.out.println("\nLesson 44 - Exceptions");
		
		Scanner scanner = new Scanner(System.in);		
		
		try {
			
			System.out.println("Enter first value");
			int a = scanner.nextInt();
			
			System.out.println("Enter second value");
			int b = scanner.nextInt();
			
			double c = (double) a / b;
			
			System.out.println("Result: " + c);
			
		} 
		catch (ArithmeticException e) {
			System.out.println("You can't divide by zero");			
		}
		catch (InputMismatchException e) {
			System.out.println("Incorrect input type");
		}
		catch (Exception e) {
			System.out.println("Unexpected error occured");
		}
		finally {
			scanner.close();
		}
		
	}
}
