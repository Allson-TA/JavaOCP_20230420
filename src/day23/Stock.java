package day23;

import java.util.Random;

public class Stock implements Runnable {
	
	private Callback cb;
	
	public Stock(Callback cb) {
		this.cb = cb;
	}
	
	@Override
	public void run() {
		while (true) {
			// 從雲端取得股價報價
			try {
				Thread.sleep(new Random().nextInt(2000));
			} catch (Exception e) {
				
			}
			int price = new Random().nextInt(50) + 500;  // 股價
			cb.printPrice(price);
			if(price == 500) {
				break;
			}
		}
		
	}
	
}