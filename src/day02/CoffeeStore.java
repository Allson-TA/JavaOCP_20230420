package day02;

public class CoffeeStore {

	public static void main(String[] args) {
		
		int total = 0;
		
		//	設定牛奶比例
		Coffee.changeRetioOfmilk(0);
		//	印出咖啡商品資訊
		Coffee.printCoffee();
		System.out.println(Coffee.price);
		total += Coffee.price;
		
		//	設定牛奶比例
		Coffee.changeRetioOfmilk(0.3);
		//	印出咖啡商品資訊
		Coffee.printCoffee();
		System.out.println(Coffee.price);
		total += Coffee.price;
		
		//	設定牛奶比例
		Coffee.changeRetioOfmilk(0.7);
		//	印出咖啡商品資訊
		Coffee.printCoffee();
		System.out.println(Coffee.price);
		total += Coffee.price;
		
		//	請問上面的三杯咖啡共多少錢?
		
		System.out.printf("Total: %d\n" , total);
		
		
		//	Math.round --> 四捨五入
		System.out.println(Math.round(4.5));
		//	Math.round --> 無條件進位
		System.out.println(Math.ceil(4.1));
		//	Math.round --> 無條件捨去
		System.out.println(Math.floor(4.1));

	}

}
