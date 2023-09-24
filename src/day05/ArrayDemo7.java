package day05;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class ArrayDemo7 {

	public static void main(String[] args) {
		String[] names = {"John", "Vincent", null ,"Anita", "Jo",null};
		//	計算每個有效名字的字母總和與平均
		
		IntSummaryStatistics stat = Arrays.stream(names)
											.filter(x -> x != null)
											.mapToInt(x -> x.length())
											.summaryStatistics();
		System.out.println(stat);	//	印出"概要統計"資料
		System.out.println(stat.getSum());	//	從"概要統計"中得到數量
		System.out.println(stat.getAverage());	//	從"概要統計"中得到平均
	}

}
