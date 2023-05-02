package day04;

import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int[] scores = {100,90,80};
		System.out.println(scores.length);	//	scores陣列長度
		
		//	手動各別印出每一個陣列的元素位置
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		
		//	透過 for-loop 印出每個陣列裡的元素_part1
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		
		//	透過 for-loop 印出每個陣列裡的元素_part2
		for(int i=0,lens=scores.length;i<lens;i++) {
			System.out.println(scores[i]);
		}
		
		//	透過for-each(for-in)印出每個陣列裡的元素_part3
		//	for(陣列元素型態 自定義變數 : 放陣列的名字)
		//	自定義變數會自動尋訪元素
		for(int x :scores) {
			System.out.println(x);
		}
		
		//	透過 Arrays.toString(陣列名)印出每個陣列裡的元素_part4
		//	上面要先import
		System.out.println(Arrays.toString(scores));
		
		
	}

}
