package main;

public class Vehicle {

	String make;
	String model;
	double speed;
	
	Vehicle(String make, String model) {
		this.make = make;
		this.model = model;
	}
	
	void go() {
		System.out.println("The vehicle is moving");
	}
	
	void stop() {
		System.out.println("The vehicle is stopped");
	}
	
	public String toString() {
		return make + "\n" + model;
	}
}
