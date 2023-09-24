package day05;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class ArrayDemo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//	分數 -1 表示缺考
		int[] scores = {100,50,-1,40,77,-1,85,-1};
		
		//	有考試成績的學生有幾位? 平均?(不含缺考)
		
		//	1. JAVA 8 Arrays.stream()　(串流)
		
		long count = Arrays.stream(scores)
							.filter(x -> x != -1)
							.count();
		System.out.println(count);
		
		double avg = Arrays.stream(scores)
							.filter(x -> x !=-1)
							.average()		//	得到OptionalDouble物件
							.getAsDouble();	//	取出平均值資料
		System.out.println(avg);
		
		
		//	2. JAVA 8 Arrays.stream()　(串流利用"概要統計"方法) 
		IntSummaryStatistics stat = Arrays.stream(scores)
											.filter(x -> x != -1)
											.summaryStatistics();
		System.out.println(stat);	//	印出"概要統計"資料
		System.out.println(stat.getCount());	//	從"概要統計"中得到數量
		System.out.println(stat.getAverage());	//	從"概要統計"中得到平均
		
		
	}

}
