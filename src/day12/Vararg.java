package day12;

import java.util.Arrays;

public class Vararg {

	public static void main(String[] args) {
		int result = calc(10,20,30);
		System.out.println(result);
		
		int[] intArray = {10,20,30,40};
		int result2 = calc(intArray);
		System.out.println(result2);
		
	}
	
	private static int calc(int...values) {
		int sum = Arrays.stream(values).sum();
		return sum;
		
	}
	
}
