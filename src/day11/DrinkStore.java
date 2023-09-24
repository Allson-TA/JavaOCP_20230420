package day11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class DrinkStore {

	public static void main(String[] args) {
		Drink coffee = new Coffee("Latte", 65);
		Drink blackTea = new Tea("紅茶", 16);
		Drink greenTea = new Tea("綠茶", 17);
		Drink orange = new Juice("柳橙汁", 70);
		Drink watermelon = new Juice("西瓜汁", 40);
		Drink espresso = new Espresso("Espresso", 75, 2);
		
		Drink[] drinks = {coffee, blackTea, greenTea, orange, watermelon, espresso};
		// 請問哪一種飲料最便宜, 最貴, 平均價格
		Drink cheapestDrink = Arrays.stream(drinks)
				.min(Comparator.comparingInt(Drink::getPrice))
				.orElse(null);
		System.out.printf("最便宜: %s %d\n", cheapestDrink.getName(), cheapestDrink.getPrice());
		
		Drink mostExpensiveDrink = Arrays.stream(drinks)
				.max(Comparator.comparingInt(Drink::getPrice))
				.orElse(null);
		System.out.printf("最貴的: %s %d\n", mostExpensiveDrink.getName(), mostExpensiveDrink.getPrice());
		
		double averagePrice = Arrays.stream(drinks)
				.mapToInt(Drink::getPrice)
				.average()
				.orElse(0);
		System.out.printf("平均價格: %.1f\n", averagePrice);
		
		// Coffee類, Tea類, Juice類 每一組各找一杯最便宜的飲料, 並算出總和
		int total = Arrays.stream(drinks).collect(Collectors.groupingBy(d -> {
		    if (d instanceof Coffee) {
		        return "Coffee";
		    } else if (d instanceof Tea) {
		        return "Tea";
		    } else if (d instanceof Juice) {
		        return "Juice";
		    } else {
		        return "Unknown";
		    }
		}, Collectors.minBy(Comparator.comparingInt(Drink::getPrice)))).values().stream().filter(Optional::isPresent).mapToInt(d -> d.get().getPrice()).sum();
		
		System.out.println(total);
	}

}