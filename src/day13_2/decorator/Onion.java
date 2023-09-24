package day13_2.decorator;

import day13_2.Food;
import day13_2.SideDish;

public class Onion extends SideDish {

	public Onion(Food food) {
		super(food);
		Arg arg = Arg.Onion;
		name = arg.getName();
		price = arg.getPrice();
	}

}