package day03;

import java.util.Arrays;

public class ArrayDemo4 {

	public static void main(String[] args) {
		int[] scores = {100,90,83,70,60};		
		
		//	1.快速印出陣列資料
		System.out.println(Arrays.toString(scores));
		
		//	2.請計算總分
		int sum = 0;
		for(int i=0 , length=scores.length ; i<length ; i++ ) {
			sum += scores[i];
		}
		System.out.printf("總分: %d\n",sum);
		
		//	3.請計算總分(整數)
		int avg = sum / scores.length;
		System.out.printf("平均: %d\n",avg);
		
		//	4.請計算總分(浮點數)
		double avg2 = (double)sum / scores.length;
		System.out.printf("平均: %.1f\n",avg2);
	}
}
