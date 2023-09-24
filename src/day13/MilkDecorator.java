package day13;

public class MilkDecorator implements BeverageDecorator{
	
	private Beverage beverage;	//	裝飾目標
	
	public MilkDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getName() {
		return beverage.getName() + "牛奶";
	}

	@Override
	public double getCost() {
		return beverage.getCost() + 10.0;
	}
	
	
}
