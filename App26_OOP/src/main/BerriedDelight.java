package main;

public class BerriedDelight {

	String dough;
	String cream;
	String fruits;
	String topping;
	
	BerriedDelight() {}
	
	BerriedDelight(String dough) {
		this.dough = dough;
	}
	
	BerriedDelight(String dough, String cream) {
		this.dough = dough;
		this.cream = cream;
	}
	
	BerriedDelight(String dough, String cream, String fruits) {
		this.dough = dough;
		this.cream = cream;
		this.fruits = fruits;
	}
	
	BerriedDelight(String dough, String cream, String fruits, String topping) {
		this.dough = dough;
		this.cream = cream;
		this.fruits = fruits;
		this.topping = topping;
	}
	
	void showComposition() {
		System.out.println(dough + ", " + cream + ", " + fruits + ", " + topping);
	}
	
}
