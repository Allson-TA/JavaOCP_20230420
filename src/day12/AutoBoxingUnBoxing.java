package day12;

import java.util.Arrays;

public class AutoBoxingUnBoxing {

	public static void main(String[] args) {
		Integer a = 20;	//	auto-boxing   相當 Integer.valueOF(20)
		int b = 10;		
		int c = a + b;	//	auto-bunoxing 相當 a.intValue()+b
		System.out.printf("a=%d b=%d c%d\n",a.intValue(),b,c);
		System.out.printf("a=%d b=%d c%d\n",a,b,c);	//	auto-bunoxing 相當 a.intValue()
		
		
		int[] nums = {10,20,30};
		int numsum = Arrays.stream(nums)	//	得到IntStream(int串流)
							.sum();	//	總和
		
		System.out.println(numsum);
		
		Integer[] scores = {10,20,30};	//	{Integer.valueOF(10),Integer.valueOF(20),Integer.valueOF(30)}
		int scoresSum = Arrays.stream(scores)	//	得到Stream(一般物件串流)
								//	.mapToInt(score->score.intValue())	//	得到IntStream(int串流)
								//	.mapToInt(score->score)		//	得到IntStream(int串流)+auto-unboxing
								.mapToInt(Integer::intValue)	//	得到IntStream(int串流)+::(方法參考)
								.sum();	//	總和
		System.out.println(scoresSum);
								
				
	}

}
