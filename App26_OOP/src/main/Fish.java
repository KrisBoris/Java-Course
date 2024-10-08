package main;

public class Fish extends Animal implements Predator, Prey {

	@Override
	void doTheRoar() {
		System.out.println("Fish goes: 'bul bul'");
	}
	
	@Override
	public void run() {
		System.out.println("There is alwats a bigger fish");
	}

	@Override
	public void hunt() {		
		System.out.println("Fish is hunting");	
	}

}
