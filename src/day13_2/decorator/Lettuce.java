package day13_2.decorator;

import day13_2.Food;
import day13_2.SideDish;

public class Lettuce extends SideDish {

	public Lettuce(Food food) {
		super(food);
		Arg arg = Arg.Lettuce;
		name = arg.getName();
		price = arg.getPrice();
	}
	
}