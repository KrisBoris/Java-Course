package main;

public class EncapsCar {

	private String make;
	private String model;
	private int year;
	
	EncapsCar(String make, String model, int year) {
		// Faster but creates redundant code
//		this.make = make;
//		this.model = model;
//		this.year = year;
		
		setMake(make);
		setModel(model);
		setYear(year);
	}
	
	EncapsCar(EncapsCar Q) {
		this.copy(Q);
	}
	
	public String getMake() {
		return make;	
	}
	
	public String getModel() {
		return model;	
	}
	
	public int getYear() {
		return year;	
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void copy(EncapsCar Q) {
		setMake(Q.getMake());
		setModel(Q.getModel());
		setYear(Q.getYear());
	}
}
