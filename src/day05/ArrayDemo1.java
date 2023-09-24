package day05;

import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int[] scores = {100,50,40,70,85};
		//	請印出及格的分數
		
		//	1. for-each	(自動提取每個位置元素)
		for(int x : scores)	{
			if(x >=60) {	//	過濾x資料
			System.out.println(x);
			}
		}
		
		System.out.println("------------");
		
		//	2. JAVA 8 Arrays.stream()　(串流)
		Arrays.stream(scores)	//	將 int[] 串流化為IntStream
				.filter(x -> x >= 60)	//	過濾x資料，filter只for串流使用
				.forEach(x -> System.out.println(x));
		
	}
}
