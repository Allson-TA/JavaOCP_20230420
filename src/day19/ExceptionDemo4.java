package day19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		play();
	}
	
	public static void play() {
		// BMI 計算系統(重構/優化後)
		Scanner scanner = new Scanner(System.in);
		double h = getInputData(scanner, "請輸入身高cm:", "身高輸入錯誤,請重新輸入");	
		double w = getInputData(scanner, "請輸入體重kg:", "體重輸入錯誤,請重新輸入");
		double bmi = w/Math.pow(h/100, 2);
		System.out.printf("BMI = %.2f\n", bmi);
	}
	
	public static double getInputData(Scanner scanner, String message, String errorMessage) {
		do {
			try {
				System.out.print(message);
				double positiveDouble = scanner.nextDouble();
				// 判斷是否是正數
				if(positiveDouble <= 0) {
					// 不是正數就建立一個例外物件
					InputMismatchException ime = new InputMismatchException();
					throw ime;
				}
				return positiveDouble;
			} catch (InputMismatchException e) {
				scanner.nextLine(); // 取得新的一行資料
				System.out.println(errorMessage);
				continue;
			}
		} while(true);
	}

}