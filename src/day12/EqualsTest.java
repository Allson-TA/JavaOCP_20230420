package day12;

public class EqualsTest {

	public static void main(String[] args) {
		Pen p1 = new Pen("Red", 10);
		Pen p2 = new Pen("Red", 10);
		Pen p3 = new Pen("Blue", 20);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
	}

}