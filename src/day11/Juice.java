package day11;

public class Juice extends Drink{

	public Juice(String name, int price) {
		super(name, price);
	}

	@Override
	public void prepare() {
		System.out.printf("開始準備 %s 果汁\n",getName());
	}
	
	
}
