package day22;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableDemo {

	private static final String Callable = null;

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Runnable runnable = () ->{
			System.out.println("Welcome Runnable");
		};
		
		Thread t1 = new Thread(runnable);
		t1.start();
		
		//	----------------------------------------
		
		Callable<Integer> callable = () ->{
			System.out.println("Welcome Callable");
			return 88;
		};
		
		//	考題 : FutureTask<Integer> futureTask = new FutureTask<>(這裡不能放runnble,因為不會回傳);
		FutureTask<Integer> futureTask = new FutureTask(runnable,null);	//	顯示null
		//	FutureTask<Integer> futureTask = new FutureTask<>(callable);
		Thread t2 = new Thread(futureTask);
		t2.start();
		System.out.println(futureTask.get());
	}

}
