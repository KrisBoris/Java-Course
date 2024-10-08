package main;

public class AbstractCar extends AbstractVehicle {
	
	private int priv = 1;	
	public int publ = 4;
	
	@Override
	protected void go() {
		System.out.println("Abstract car is moving");		
	}

}
