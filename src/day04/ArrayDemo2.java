package day04;
import static day04.Util.getAvg;
/*
 * 調查五位學生之身高及體重如下
 * 身高：172、168、164、170、176(公分)
 * 體重：62、57、58、64、64(公斤)
 * 試問：平均與標準差
 * */
public class ArrayDemo2 {
	public static void main(String[] args) {
		double[] heights = {172, 168, 164, 170, 176};
		double[] weights = {62, 57, 58, 64, 64};
		
		// 計算身高的平均
		// 1. 先計算身高的總和
		double sumOfHeight = 0;
		for(double height : heights) {
			sumOfHeight += height;
		}
		
		// 2. 再計算身高的平均
		double avgOfHeight = sumOfHeight / heights.length;
		System.out.printf("身高總和: %.1f 身高平均: %.1f\n", sumOfHeight, avgOfHeight);
		
		// 計算體重的平均
		// 1. 先計算體重的總和
		double sumOfWeight = 0;
		for(double weight : weights) {
			sumOfWeight += weight;
		}
		
		// 2. 再計算體重的平均
		double avgOfWeight = sumOfWeight / weights.length;
		System.out.printf("體重總和: %.1f 體重平均: %.1f\n", sumOfWeight, avgOfWeight);
		
		//-----------------------------------------------------------------------------
		// 透過 getAvg() 方法來取得身高的平均
		avgOfHeight = getAvg(heights);
		System.out.printf("身高的平均: %.1f\n", avgOfHeight);
		
		// 透過 getAvg() 方法來取得體重的平均
		avgOfWeight = getAvg(weights);
		System.out.printf("體重的平均: %.1f\n", avgOfWeight);
	}
	
		
	
}