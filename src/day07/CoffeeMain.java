package day07;

import java.util.Arrays;

public class CoffeeMain {

	public static void main(String[] args) {
		Coffee c1 = new Coffee();
		c1.brand = "藍山咖啡";c1.temperature= 60;c1.price= 90;
		
		Coffee c2 = new Coffee();
		c2.brand = "摩卡咖啡";c2.temperature= 40;c2.price= 65;
		
		Coffee c3 = new Coffee();
		c3.brand = "冰滴咖啡";c3.temperature= 2;c3.price= 120;
		
		Coffee[] coffees = {c1,c2,c3};
		
		//	請求出咖啡平均價格(prat1)
		/*
		int sum = 0;
		for(int i=0;i<Coffees.length;i++) {
			System.out.println(Coffees[i].price);
			sum += Coffees[i].price;
		}
		System.out.println(sum);
		
		int avg = sum/Coffees.length;
		System.out.println(avg);
		*/
		
		//	請求出咖啡平均價格(prat2)
		int avg = 0;
		int sum = 0;
		for(Coffee coffee : coffees) {	//	for-each
			sum += coffee.price;
		}
		avg = sum / coffees.length;
		System.out.println(avg);
		
		//	請求出熱咖啡與冰咖啡的平均價格各為多少
		/*
		double totalHotCoffeePrice = 0;
		double totalIcedCoffeePrice = 0;
		int hotCoffeeCount = 0;
		int icedCoffeeCount = 0;

		for (int k = 0; k < Coffees.length; k++) {
		    if (Coffees[k].isHot()) {
		        totalHotCoffeePrice += Coffees[k].price;
		        hotCoffeeCount++;
		        System.out.println("熱咖啡"+Coffees[k].temperature);
		    } else {
		        totalIcedCoffeePrice += Coffees[k].price;
		        icedCoffeeCount++;
		        System.out.println("冰咖啡"+ Coffees[k].temperature);
		    }
		}

		double ageHotCoffeePrice = totalHotCoffeePrice / hotCoffeeCount;
		double ageIcedCoffeePrice = totalIcedCoffeePrice / icedCoffeeCount;
		
		System.out.println("熱咖啡的總價格：" + totalHotCoffeePrice);
		System.out.println("熱咖啡的總價格：" + totalIcedCoffeePrice);
		System.out.println("熱咖啡的平均價格：" + ageHotCoffeePrice);
		System.out.println("冰咖啡的平均價格：" + ageIcedCoffeePrice);
		*/
		
		double hotCoffeeAvgPrice =  Arrays.stream(coffees)
										  .filter(coffee -> coffee.isHot())
										  .mapToInt(coffee -> coffee.price)
										  .average()
										  .getAsDouble();

		double coldCoffeeAvgPrice =  Arrays.stream(coffees)
										   .filter(coffee -> !coffee.isHot())
										   .mapToInt(coffee -> coffee.price)
										   .average()
										   .getAsDouble();
	
		System.out.println(hotCoffeeAvgPrice);
		System.out.println(coldCoffeeAvgPrice);
	}

}
