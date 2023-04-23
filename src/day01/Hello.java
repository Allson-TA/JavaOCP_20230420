package day01;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello Java");
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入半徑:");
		double r = scanner.nextDouble();
		//	計算園面積
		double area = Math.PI * Math.pow(r, 2);
		System.out.printf("面積: %,.2f\n",area);
	}
//03
}
