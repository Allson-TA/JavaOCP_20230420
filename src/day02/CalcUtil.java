package day02;

//	計算工具
//	設計 : 加法add , 計算bmi

public class CalcUtil {
	
//	公開		屬於CalcUtil類別
	public 		static 		int add(int x , int y) {
		int sum = x + y;
		return sum;
	}
		
	public static double getBMI(double height , double weight) {
		double bmi = weight /  Math.pow(height/100,2);
		return bmi;
	}
	
	public static void main(String[] args) {
		int a = 100000 , b = 200000;
		int result = add(a , b);
		System.out.printf("result: %d\n",result);
		System.out.printf("result: %,d\n",result);
		
		double h = 170;
		double w = 60.0;
		double bmiValue = getBMI(h , w);
		System.out.printf("BMI: %f\n", bmiValue);
		System.out.printf("BMI: %.2f\n", bmiValue);
	}

}
