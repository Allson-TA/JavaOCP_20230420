package day13;

public class Tea extends AbstractBeverage{
	
	public Tea(String name,double cost) {
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
		return "Tea [name=" + name + ", cost=" + cost + "]";
	}
	
	
	

}
