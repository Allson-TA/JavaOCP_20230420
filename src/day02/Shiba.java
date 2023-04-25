package day02;

// Shiba 柴犬
public class Shiba {
	// 定義類別屬性
	public static String name = "小白"; // 姓名
	public static String color = "白"; // 顏色
	public static int age = 5; // 年齡
	
	// 定義類別方法
	public static void eat() { // 吃東西
		String food = "骨頭";
		System.out.printf("%s 喜歡吃 %s\n", name, food);
	}
	
	public static void play() { // 玩甚麼
		String game = "飛盤";
		System.out.printf("%s 喜歡玩 %s\n", name, game);
	}
	
	// 狗的年齡換算成人的年齡
	public static int getAgeOfHuman() {
		int ageOfHuman = age * 6;
		return ageOfHuman;
	}
	
}