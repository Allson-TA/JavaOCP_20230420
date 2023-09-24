package day11;

public class Coffee extends Drink{

	public Coffee(String name, int price) {
		super(name, price);
	}

	@Override
	public void prepare() {
		System.out.printf("開始準備 %s 咖啡\n",getName());
	}
	
	
}
