package day05;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;

public class OptionalDemo {

	public static void main(String[] args) {
		//	Optional 可能包含也可能不包含容器
		//	-1 表示缺考
		//	請計算出及格分數的平均值()	(不含缺考)
		int[] scores = {40,-1,50,35,-1};
		
		//	1. for-each
		int count = 0;
		int sum = 0;
		for(int x :scores) {
			if(x != -1 && x >= 60) {
				count++;
				sum+= x;
			}
		}
		double avg = (double)sum / count;
		System.out.println(avg);
		
		
		
		//	2. JAVA 8 Arrays.stream()　(串流)
		OptionalDouble OptAvg = Arrays.stream(scores)
		                .filter(score -> score >= 0) // 只保留及格分數
		                .average(); // 計算平均值
		if(OptAvg.isPresent()) {	//	容器內是否有平均
			System.out.println(OptAvg.getAsDouble());
		} else {
			System.out.println("平均資料不存在");
		}
		
	}
}
