package day09;

public class Dessert extends Food {
	
	private int sweetness;
	
	public Dessert() {
		
	}

	public Dessert(String name, int price, int sweetness) {
		super(name, price);
		this.sweetness = sweetness;
	}

	public int getSweetness() {
		return sweetness;
	}

	public void setSweetness(int sweetness) {
		this.sweetness = sweetness;
	}

	@Override
	public String toString() {
		return "Dessert [sweetness=" + sweetness + ", " + super.toString() + "]";
	}
	
	
	
}