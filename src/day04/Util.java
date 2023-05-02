package day04;

public class Util {
	// 專門計算 double[] 平均的方法

	public static double getAvg(double[] items) {
		double sum = 0;
		for(double item : items) {
			sum += item;
		}
		double avg = sum / items.length;
		return avg;
	}		
	
	// 專門計算 double[] 標準差的方法
	public static double getSD(double[] items) {
		double avg = Util.getAvg(items);
		double sum = 0; // 平方和的總和
		for(double item : items) {
			sum += Math.pow(item-avg, 2);
		}
		double sd = Math.sqrt(sum/items.length);
		return sd;
	}
	
	// 專門計算 double[] 變異係數CV的方法
	public static double getCV(double[] items) {
		double cv = getSD(items) / getAvg(items);
		return cv;
	}
	
}


