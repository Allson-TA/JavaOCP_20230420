package day04;

public class ArrayDemo4 {
	
	public static void main(String[] args) {
		//	標準差 = 平方根 [ (每個數據 - 平均數)²的總和 / 數據的個數 ]
		//	如何計算標準差?
		double[] scores = {100,90,80};
		double avg = Util.getAvg(scores);
		
		//	(100 - avg)^2 + (90 - avg)^2 + (80 - avg)^2
		double sum = 0;	//	平方和的總和
		for(double score : scores) {
			sum += Math.pow(score-avg,2);
		}
		System.out.println(sum);
		
		//	Math.sqrt() -->開根號
		double sd = Math.sqrt(sum/scores.length);
		System.out.println(sd);
		
		//	透過Util.getSD() 得到標準差
		double sd2 = Util.getSD(scores);
		System.out.println(sd2);
		
	}

}
