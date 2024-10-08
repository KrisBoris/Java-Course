package package2;

import main.AbstractVehicle;

public class B extends AbstractVehicle {

	protected void go() {
		
	}
	
	public static void main(String[] args) {
	
		B b = new B();
		
//		b.def;	// Not visible
		System.out.println(b.prot);
	}

}
