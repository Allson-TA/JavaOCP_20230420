package day13;

public class Coffee extends AbstractBeverage{
	
	public Coffee(String name,double cost) {
		super(name,cost);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getCost() {
		return cost;
	}

	@Override
	public String toString() {
		return "Coffee [name=" + name + ", cost=" + cost + "]";
	}

	
	
	
	

}
