package package2;

import main.AbstractVehicle;

public class C extends AbstractVehicle {
		
	B b = new B();
	
	protected void go() {
		
	}
	
	void test() {
//		System.out.println(b.prot);	// Not visible
//		System.out.println(b.def);	// Not visible	
		System.out.println(prot);
//		System.out.println(def);	// Not visible
	}
}
