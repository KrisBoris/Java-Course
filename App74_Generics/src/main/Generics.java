package main;

public class Generics<T1 extends Number, T2 extends Number> {
	
	T1 x;
	T2 y;
	
	Generics(T1 x, T2 y) {
		this.x = x;
		this.y = y;
	}
	
	public <T> void displayArray(T[] array) {
		for(T i : array)
			System.out.print(i + " ");
		System.out.println();
	}
	
	public <T> T getFirst(T[] array) {
		return array[0];
	}
	
	public T1 getValue() {
		return x;
	}
}
