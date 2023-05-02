package day04;

import java.util.Arrays;

public class ArrayDemo8 {

	public static void main(String[] args) {
		int[] scores = {100,80,70};
		
		//	逐一印出每個陣列元素 ( for-each / for-in)
		for(int score : scores) {
			System.out.println(score);
		}
		
		//	簡化版
		//	可以透過Arrays.stream() 的for-Each() 方法尋訪元素
		Arrays.stream(scores).forEach(score -> System.out.println(score));
		
		//	透過 :: (方法參考)
		Arrays.stream(scores).forEach(System.out::println);
	}

}
