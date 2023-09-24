package day06;

import java.util.Arrays;

public class MultiArrayDemo5 {

	public static void main(String[] args) {
		
		//	三組{身高體重}的組合
		double[] [] mm = {
				{170,60},
				{180,80},
				{165,55}
			};
		
		//	請求出每組的bmi資料
		for(double[] m:mm) {
			
			double h =m[0];	//	身高
			double w =m[1];	//	體重
			double bmi = w / Math.pow(h/100,2);
			System.out.printf("h=%.1f w=%.1f bmi=%.1f\n",h,w,bmi);			
		}
		
		//	Java 8 串流
		Arrays.stream(mm)
         .map(m -> m[1] / Math.pow(m[0] / 100, 2)) // 计算BMI值
         .forEach(bmi -> System.out.printf("BMI: %.1f\n", bmi));
}
		
	}
	

