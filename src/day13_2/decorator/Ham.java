package day13_2.decorator;

import day13_2.Food;
import day13_2.SideDish;

public class Ham extends SideDish {

	public Ham(Food food) {
		super(food);
		Arg arg = Arg.Ham;
		name = arg.getName();
		price = arg.getPrice();
	}
	
}