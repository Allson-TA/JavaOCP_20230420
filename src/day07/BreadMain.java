package day07;

import java.util.Arrays;

public class BreadMain {

	public static void main(String[] args) {
		
		Bread b1 = new Bread();
		b1.type = "法國麵包";b1.weight=100;
		
		Bread b2 = new Bread();
		b2.type = "小麵包";b2.weight=5;
		
		Bread b3 = new Bread();
		b3.type = "油條麵包";b3.weight=15;
		
		//	請問買三個法國麵包+兩個小餐包+四個油條麵包，共金額?
		/*
		int totaltype = (b1.getPrice() * 3) + (b2.getPrice() * 2) + (b3.getPrice() * 4);
		System.out.println("總金額：" + totaltype + " 新台幣");
		*/
		
		Bread[] breads = {b1,b1,b1,b2,b2,b3,b3,b3,b3};
		int sum = 0;
		for(Bread bread:breads) {
			sum += bread.getPrice();
		}
		System.out.println(sum);
		
		int sum2 = Arrays.stream(breads).mapToInt(bread -> bread.getPrice()).sum();
		System.out.println(sum2);
		
		/*
		Bread[] breads = [b1, b2, b3];
		int[] count= [3, 2, 4];
		int sum=0;
		for (int i=0, Im-breads.length; i<=lm; itt) (
			switch (i) (
			case 0:
				sum += (count[i]*breads[i].getprice());
				break;
			case 1:
				sum += (count[i]*breads[i].getprice());
				break;
			case 2:
				sum += (count[i]*breads[i].getPrice());
				break;
			}
			System. out.printin(sum);
		 */
	}

}
