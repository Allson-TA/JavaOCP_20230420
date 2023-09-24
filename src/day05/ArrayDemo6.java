package day05;

import java.util.Arrays;

public class ArrayDemo6 {
	public static void main(String[] args) {
		String[] names = {"John", "Vincent", "Anita", "Jo"};
		// 題目:計算名字的平均字母有幾個 (使用 Java 8 stream)
		double avg = Arrays.stream(names)  // ["John", "Vincent", "Anita", "Jo"]
						   .mapToInt(x -> x.length()) // [4, 7, 5, 2]
						   .average()
						   .getAsDouble();
		System.out.println(avg);
	}					   
}