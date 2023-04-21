package day01;

public class Hello4 {

	public static void main(String[] args) {
//		計算BMI part1
		calcAndPrintBMI(170,60);
		calcAndPrintBMI(165,52.5);
		calcAndPrintBMI(180.2,75);
		//	計算BMI part2
		calcBMI(170,60);
		calcBMI(165,52.5);
		calcBMI(180.2,75);
		
	}
	
	public static void calcAndPrintBMI(double h,double w) {
		double bmi = w / Math.pow(h/100, 2);
		System.out.printf("BMI: %.2f\n",bmi);
	
	}
	
	public static void calcBMI(double h,double w) {
		double bmi = w / Math.pow(h/100, 2);
		//	計算完成之後由調用 PrintBMI(bmi);	方法列印bmi資料
		printBMI(bmi);
	}
	
	public static void printBMI(double bmi) {
		System.out.printf("BMI: %.2f\n",bmi);
	}
	
}
