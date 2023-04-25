package day02;

import static day02.CalcUtil.add;
import static day02.CalcUtil.getBMI;

public class CalcTest {

	public static void main(String[] args) {
		//	1.	進行加法運算
		int a = 10 , b =20;
		int result = add(a, b);
		System.out.printf("resukt: %d\n", result);
		
		//	2.	進行bmi運算
		double h = 170, w = 60;
		double bmiValue = getBMI(h, w);
		System.out.printf("BMI: %.1f\n", bmiValue);
	}

}
