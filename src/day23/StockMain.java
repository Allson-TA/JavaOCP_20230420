package day23;


class Callback {
	void printPrice(int price) {
		System.out.println("股價:" + price);
	}
}

public class StockMain {
	
	public static void main(String[] args) {
		Callback cb = new Callback();
		new Thread(new Stock(cb)).start();
	}

}