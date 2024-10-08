package main;

public class Bear extends Animal implements Predator {
	
	@Override
	void doTheRoar() {
		System.out.println("Bear goes: 'Koda, your mother is not coming'");
	}

	@Override
	public void hunt() {
		System.out.println("Bear is hunting");		
	}

}
