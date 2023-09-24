package day23;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class JobDemo {

	public static void main(String[] args) throws Exception {
		//	ExecutorService service = Executors.newCachedThreadPool();
		ExecutorService service = Executors.newFixedThreadPool(2);
		//	ExecutorService service = Executors.newSingleThreadExecutor();
		service.submit(new ShortJob());
		service.submit(new ShortJob());
		service.submit(new LongJob());
		service.submit(new LongJob());
		service.submit(new ShortJob());
		service.submit(new ShortJob());
		service.submit(new ShortJob());
		service.submit(new ShortJob());
		service.submit(new LongJob());
		
		//	(考題)
		service.shutdown(); // 上述任務執行完畢之後就將 service 關閉，不然會一直繼續等待 (平滑關閉)
		//	service.shutdownNow();	//	強制關閉
		
		//	監控執行緒池的狀況
		while(!service.awaitTermination(1, TimeUnit.SECONDS)) {
			System.out.println("執行緒池沒有關閉，還有任務使用中...");
		}
		
		System.out.println("執行緒池已關閉");
	}

}