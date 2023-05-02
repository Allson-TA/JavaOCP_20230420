package day04;

import static day04.Util.getCV;
/*
 * 調查五位學生之身高及體重如下
 * 身高：172、168、164、170、176(公分)
 * 體重：62、57、58、64、64(公斤)
 * 試問：請問該學生的身高，體重哪一個資料較集中?
 */

public class ArrayDemo6 {
	public static void main(String[] args) {
		double[] heights = {172, 168, 164, 170, 176};
		double[] weights = {62, 57, 58, 64, 64};
		
		//	變異係數
		double cvOfHeight = getCV(heights);
		double cvOfWeight = getCV(weights);
		System.out.println(cvOfHeight);
		System.out.println(cvOfWeight);
		
	}
}