package day13_2.decorator;

import day13_2.Food;
import day13_2.SideDish;

public class Beef extends SideDish {

	public Beef(Food food) {
		super(food);
		Arg arg = Arg.Beef;
		name = arg.getName();
		price = arg.getPrice();
	}
	
}