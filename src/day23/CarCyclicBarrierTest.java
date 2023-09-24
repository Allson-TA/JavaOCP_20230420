package day23;

import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

public class CarCyclicBarrierTest {

	public static void main(String[] args) {
		
		int parties = 4;
		Runnable lunch = ()->System.out.println("吃中餐");
		
		CyclicBarrier cyclicBarrier = new CyclicBarrier(３,lunch);

		IntStream.rangeClosed(1, parties).forEach(i -> {
							Car car = new Car(cyclicBarrier);
							car.setName("T"+i);
							car.start();
		});
		
	}

}
