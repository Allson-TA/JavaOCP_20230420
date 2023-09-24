package day11;

public class Tea extends Drink{

	public Tea(String name, int price) {
		super(name, price);
	}

	@Override
	public void prepare() {
		System.out.printf("開始準備 %s 茶\n",getName());
	}
	
	
}
