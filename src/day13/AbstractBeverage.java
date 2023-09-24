package day13;

public abstract class AbstractBeverage implements Beverage{
	
	protected String name;
	protected double cost;
	
	public AbstractBeverage(String name,double cost) {
		this.name=name;
		this.cost=cost;
		
	}
	
}
