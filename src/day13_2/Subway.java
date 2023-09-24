package day13_2;

import day13_2.decorator.Beef;
import day13_2.decorator.Egg;
import day13_2.decorator.Ham;
import day13_2.decorator.Lettuce;
import day13_2.decorator.Olives;
import day13_2.decorator.Onion;
import day13_2.decorator.Tomato;

public class Subway {

	public static void main(String[] args) {
		Food food = new Bread();
		food = new Ham(food);
		food = new Lettuce(food);
		food = new Egg(food);
		food = new Egg(food);
		food = new Beef(food);
		food = new Olives(food);
		food = new Olives(food);
		food = new Olives(food);
		food = new Tomato(food);
		food = new Onion(food);
		
		System.out.printf("商品(潛艇堡內容物): %s\n商品總價: %d\n", food.getName(), food.getPrice());
	}

}