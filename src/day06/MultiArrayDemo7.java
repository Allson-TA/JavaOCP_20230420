package day06;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class MultiArrayDemo7 {
	public static void main(String[] args) {
		
		// 三維陣列表示不同區域 (2個區域)、不同門市 (3個門市) 和每個門市的每月銷售額 (12個月)。
        int[][][] sales = {
            {
                {10000, 15000, 12000, 9000, 11000, 16000, 20000, 19000, 17000, 8000, 11000, 10000},
                {9000, 10000, 13000, 8000, 12000, 18000, 22000, 18000, 16000, 7000, 9000, 8000},
                {12000, 14000, 15000, 10000, 13000, 20000, 25000, 20000, 18000, 9000, 12000, 11000}
            },
            {
                {11000, 16000, 13000, 10000, 12000, 17000, 21000, 20000, 18000, 9000, 12000, 11000},
                {10000, 11000, 14000, 9000, 13000, 19000, 23000, 19000, 17000, 8000, 10000, 9000},
                {13000, 15000, 16000, 11000, 14000, 21000, 26000, 21000, 19000, 10000, 13000, 12000}
            }
        };
		
		// 每一個門市的年度總銷售額
        int sum = 0;
        for(int[][] area : sales) {
        	//	System.out.println(area);	//	算出兩個區域
        	for(int[] store : area) {
        		System.out.println(store + " " + Arrays.stream(store).sum());
        	}
        	
        }

        
        // 門市的年度總銷售額最大與最小個為何 ?
        IntSummaryStatistics stat = Arrays.stream(sales)
        		.flatMap(store -> Arrays.stream(store))	//	將區域拆掉之後會得到6家門市
        		.mapToInt(store -> Arrays.stream(store).sum())	//	計算每個門市的年度總銷售額
        		.summaryStatistics();
        System.out.println(stat);
        System.out.println(stat.getMax());
        System.out.println(stat.getMin());
	}
}