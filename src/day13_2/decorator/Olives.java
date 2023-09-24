package day13_2.decorator;

import day13_2.Food;
import day13_2.SideDish;

public class Olives extends SideDish {

	public Olives(Food food) {
		super(food);
		Arg arg = Arg.Olives;
		name = arg.getName();
		price = arg.getPrice();
	}

}