package day03;

public class StringDemo {

	public static void main(String[] args) {
		//	字元
		char x = 'A';
		char y = 'A';
		
		//	字串
		String s1 = new String("Java");
		String s2 = new String("Java");
		
		System.out.printf("x = %c\n" , x);
		System.out.printf("x = %c\n" , y);
		
		System.out.printf("s1 = %s\n" , s1);
		System.out.printf("s2 = %s\n" , s2);
		
		System.out.printf("x == y = %b\n" , (x == y));
		System.out.printf("s1 == s2 %b\n" , (s1 == s2));
		System.out.printf("s1.equals(s2) == s2 %b\n" , s1.equals(s2));
	}

}
