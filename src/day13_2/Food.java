package day13_2;

public abstract class Food {
	
	protected String name;
	protected int price;
	
	public abstract String getName(); // 抽象方法-讓子類別自行實作
	public abstract int getPrice();
	
}