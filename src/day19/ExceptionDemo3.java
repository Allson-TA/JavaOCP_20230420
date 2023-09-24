package day19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		play();
	}
	
	public static void play() {
		// BMI 計算系統
		Scanner scanner = new Scanner(System.in);
		double h=0, w=0;
		while (true) {
			try {
				System.out.print("請輸入身高cm: ");
				h = scanner.nextDouble();
				break;
			} catch (InputMismatchException e) {
				scanner.nextLine(); // 取得新的一行資料
				System.out.println("身高輸入錯誤, 請重新輸入");
				continue;
			}
		}
		
		while (true) {
			try {
				System.out.print("請輸入體重kg: ");
				w = scanner.nextDouble();
				break;
			} catch (InputMismatchException e) {
				scanner.nextLine(); // 取得新的一行資料
				System.out.println("體重輸入錯誤, 請重新輸入");
				continue;
			}
		}
			
		double bmi = w/Math.pow(h/100, 2);
		System.out.printf("BMI = %.2f\n", bmi);
		
		
	}
	

}