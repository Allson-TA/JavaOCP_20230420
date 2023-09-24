package day13_2.decorator;

import day13_2.Food;
import day13_2.SideDish;

public class Tomato extends SideDish {

	public Tomato(Food food) {
		super(food);
		Arg arg = Arg.Tomato;
		name = arg.getName();
		price = arg.getPrice();
	}
	
}