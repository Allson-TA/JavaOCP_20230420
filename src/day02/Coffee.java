package day02;

public class Coffee {

	public static String name;	//	咖啡名稱
	public static double ratioOfMilk;	//	牛奶的比例
	public static int price;	//	價格
	
	//	調整牛奶比例的方法
	public static void changeRetioOfmilk(double ratio) {
		ratioOfMilk = ratio;
		price = (int) (45 + 45*(ratio));
		if(ratio == 0) {
			name = "美式";
			price = 45;
		} else if (ratio == 0.3) {
			name = "卡布奇諾";
		} else if (ratio == 0.7) {
			name = "拿鐵";
		} else {
			name = "無此咖啡";
			ratioOfMilk = 0;
			price = 0;
		}
	}
	
	//	印出咖啡商品資訊
	public static void printCoffee() {
		System.out.printf("品名: %s 牛奶的比例: %.1f 價格 %d\n" , name , ratioOfMilk , price);
	}
}
