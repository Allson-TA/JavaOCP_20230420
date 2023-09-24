package day23;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Car extends Thread{
	
	private CyclicBarrier cyclicBarrier;
	public Car(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier = cyclicBarrier;
	}
	
	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		System.out.printf("%s 往台中出發\n",tName);
		
		//	(作業)模擬開車時間
		try {
			Thread.sleep(new Random().nextInt(5000));
			System.out.printf("%s 到台中了\n",tName);
			cyclicBarrier.await();	//	等待其他執行續
		} catch (Exception e) {
			
		}
		
		//	繼續往回家路開
		System.out.printf("%s 到家\n",tName);
		
	}
	
}
