package day11;

//	飲料 : 基礎類(抽象)
public abstract class Drink {	
	private String name;
	private int price;
	public Drink(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public abstract void prepare();
	
	@Override
	public String toString() {
		return "Drink [name=" + name + ", price=" + price + "]";
	}
	
	
}
