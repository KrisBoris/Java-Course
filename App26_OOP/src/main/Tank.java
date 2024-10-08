package main;

public class Tank extends Vehicle {

	String unit;
	int operators = 4;
	
	Tank(String make, String model, String unit, int operators) {
		super(make, model);
		this.unit = unit;
		this.operators = operators;
	}
	
	@Override
	void go() {
		System.out.println("Starting-up the engine");
	}
	
	public String toString() {
		return super.toString() + "\n" + unit + "\n" + operators;
	}
}
