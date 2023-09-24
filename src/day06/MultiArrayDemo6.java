package day06;

import java.util.Arrays;

public class MultiArrayDemo6 {

	public static void main(String[] args) {
		// 三個員工的時薪和加班費如下
		double [][] employeeDate = {
				{150,3},
				{200,4},
				{100,6}
		};
		
		//	請問公司總共要付多少加班費
		int sum = 0;
		for(double[] emp : employeeDate) {
			double fee = emp[0] * emp[1];
			System.out.println(fee);
			sum += fee;
		}
		System.out.println("總計: "+sum);
		
		
		// Java 8 stream
		double sum2 =Arrays.stream(employeeDate)
							.mapToDouble(emp -> emp[0] * emp[1])
							.sum();
		System.out.println(sum2);
		


	}

}
