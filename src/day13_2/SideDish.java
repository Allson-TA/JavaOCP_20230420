package day13_2;

public class SideDish extends Food {
	
	protected Food food; // 裝飾對象
	
	public SideDish(Food food) {
		this.food = food;
	}

	@Override
	public String getName() {
		return name + " + " + food.getName();
	}

	@Override
	public int getPrice() {
		return price + food.getPrice();
	}
	
}