package day05;

import java.util.Arrays;

public class ArrayDemo3 {

	public static void main(String[] args) {
		//	分數 -1 表示缺考
		int[] scores = {100,50,-1,40,77,-1,85,-1};
		
		//	有考試成績的學生有幾位? 平均?(不含缺考)
		
		// 1. for-each (if拆分)
		int count = 0;
		for(int x : scores) {
			if(x != -1) {
				count++;
			}
		}
		System.out.println(count);
		int sum = 0;
		for(int x : scores) {
			if(x != -1) {
				sum += x;
			}
		}
		double avg = (double)sum / count;
		System.out.println(avg);
		
		// 2. for-each (if合併)
		int count2 = 0;
		int sum2 = 0;
		for(int x : scores) {
			if(x != -1) {
				count2++;
				sum2 += x;
			}
		}
		double avg2 = (double)sum2 / count2;
		System.out.println(avg2);
				
	}

}
