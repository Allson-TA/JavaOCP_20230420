package day12;

public class EqualsTest2 {

	public static void main(String[] args) {
		Student s1 = new Student("John",18,90,"大一");
		Student s2 = new Student("John",18,90,"大一");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}

}
