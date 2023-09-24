package day13;

public class SugarDecorator implements BeverageDecorator{
	
	private Beverage beverage;	//	裝飾目標
	
	public SugarDecorator(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getName() {
		return beverage.getName() + "黑糖";
	}

	@Override
	public double getCost() {
		return beverage.getCost() + 7.0;
	}
	
	
}
