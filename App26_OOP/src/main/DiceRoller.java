package main;

import java.util.Random;

public class DiceRoller {
	
	Random random;
	int number;
	
	DiceRoller() {
		random = new Random();
		number = random.nextInt(6) + 1;
		roll();
	}
	
	void roll() {
		System.out.println(number);
	}
	
}
