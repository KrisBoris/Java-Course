package main;

public class Sheep extends Animal implements Prey {

	@Override
	void doTheRoar() {
		System.out.println("Sheep goes: 'beee'");
	}
	
	@Override
	public void run() {
		System.out.println("Sheep is fleeing");		
	}

	
}
