package main;

public class Bike extends Vehicle {
	
	String owner;
	int wheels = 2;
	
	Bike(String make, String model, String owner, int wheels) {
		super(make, model);
		this.owner = owner;
		this.wheels = wheels;
	}
	
	public String toString() {
		return super.toString() + "\n" + owner + "\n" + wheels;
	}
}
