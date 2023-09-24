package day23;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class LongJob implements Callable {

	@Override
	public Object call() throws Exception {
		String tName = Thread.currentThread().getName();
		System.out.println("長任務開始-" + tName);
		TimeUnit.SECONDS.sleep(3);
		System.out.println("長任務結束-" + tName);
		return null;
	}
	
}