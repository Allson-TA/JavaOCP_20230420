package day01;

public class Hello3 {

	public static void main(String[] args) {
		leftStars();
		rightStars();
		leftStars();
		rightStars();
		leftStars();
	}
	
	public static void leftStars(){
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
	}
	
	public static void rightStars(){
		System.out.println("  *");
		System.out.println(" **");
		System.out.println("***");
	}
}
