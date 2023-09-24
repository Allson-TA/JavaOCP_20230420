package day06;

public class MultiArrayDemo3 {

	public static void main(String[] args) {
		int[] [] mm = {
				{100,90},
				{85,75,65},
				{70,60}
			};
		
		//	for-each來抓取每筆資料
		//	m-->隨機變數算出Hashcode , mm-->二維陣列 , x-->抓出Hashcode子元素的值
		for(int[] m : mm) {
			for(int x : m) {
				System.out.println(x);
			}
			
		}
		
		
	}

}
