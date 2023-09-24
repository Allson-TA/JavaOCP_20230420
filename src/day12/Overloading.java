package day12;

public class Overloading {

	private static void play(int...values) {
		System.out.println("A");
	}
	
	private static void play(Integer values) {
		System.out.println("B");
	}
	
	private static void play(double values) {
		System.out.println("C");
	}
	
	private static void play(int values) {
		System.out.println("D");
	}
	
	public static void main(String[] args) {
		play(10);	//	Integer.valufOF(10)

	}

}
