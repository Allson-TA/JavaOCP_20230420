package day20;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test3A {

	@Test
	public void test() {
		System.out.println("開始測試"); 
		
		// 1. Arrange(安排)
		int w = 10; // 測試參數
		int h = 10; // 測試參數
		Square square = new Square(); // 待測試物件
		int expResult = 100; // 期望結果
		
		// 2. Act(執行)
		int result = square.getArea(w, h); // 實際結果
		
		// 3. Assert(斷言判斷)
		assertEquals(expResult, result); // 期望結果 == 實際結果
		
		System.out.println("測試結束");
	}
	
}