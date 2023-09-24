package day06;

import java.util.Arrays;

public class MultiArrayDemo1 {

	public static void main(String[] args) {

		//	一維陣列		
		int[] n = {100,90,80};
		
		//	對稱型_二維陣列
		int[] [] m = {
						{100,90,80},
						{70,60,50}
					};
		System.out.println(n);
		System.out.println(m);
		/*
		[I@58ceff1
		[[I@7c30a502 
		[-->幾維陣列的意思
		I-->INT
		@-->at(在)
		後面Hashcodecode-->代表在記憶體建立的Hashcode
		 */
		
		//	Arrays.toString用來看一維陣列的資料，不適用於二維陣列
		System.out.println(Arrays.toString(n));
		System.out.println(Arrays.toString(m));
		
		//	二維陣列要寫出維度位置
		System.out.println(Arrays.toString(m[0]));
		System.out.println(Arrays.toString(m[1]));
		
		//	陣列長度
		System.out.println(m.length);
		System.out.println(m[0].length);
		System.out.println(m[1].length);
	}

}
