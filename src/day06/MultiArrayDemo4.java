package day06;

import java.util.Arrays;

public class MultiArrayDemo4 {

	public static void main(String[] args) {
		int[] [] mm = {
				{100,90},
				{85,75,65},
				{70,60}
			};
		
		//	Java 8 Stream來印出每個元素
		//	{{100,90},{85,75,65},{70,60}}
		Arrays.stream(mm)	
		
				//	{100,90},{85,75,65},{70,60} 打成一長串流
				//	flat-->打平的意思(二維降維打成一維陣列)，Map-->轉換
				.flatMapToInt(m -> Arrays.stream(m))
				
				//	x代表每一個元素，則把元素都印出來
				.forEach(x -> System.out.println(x));
		
	}

}
