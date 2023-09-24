package day13_2.decorator;

public enum Arg {
	Beef("牛肉", 35),
	Egg("雞蛋", 20),
	Ham("火腿", 30),
	Lettuce("生菜", 15),
	Olives("橄欖", 10),
	Onion("洋蔥", 5),
	Tomato("蕃茄", 12);
	
	private String name;
	private int price;
	
	private Arg(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
}