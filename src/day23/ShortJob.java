package day23;

public class ShortJob implements Runnable {

	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		System.out.println("短任務-" + tName);
	}
	
}