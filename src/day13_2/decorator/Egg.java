package day13_2.decorator;

import day13_2.Food;
import day13_2.SideDish;

public class Egg extends SideDish {

	public Egg(Food food) {
		super(food);
		Arg arg = Arg.Egg;
		name = arg.getName();
		price = arg.getPrice();
	}
	
}