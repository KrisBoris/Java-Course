package main;

public class Car {

	String make = "Tesla";
	String model = "Model S";
	int year = 2020;
	String color = "Red";
	double price = 49000.00;
	
	void drive() {
		System.out.println("You drive the car");
	}
	
	void brake() {
		System.out.println("You pushed the breaks");
	}
	
	// Lesson 30 - toString method
	public String toString() {
		return make + "\n" + model + "\n" + color + "\n" + year;
	}
	
}
