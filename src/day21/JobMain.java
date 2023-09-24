package day21;

public class JobMain {
	
	//	主程式
	public static void main(String[] args) {
		
		String threadName = Thread.currentThread().getName();
		System.out.printf("主執行緒名稱: %s\n",threadName);
		
		//	建立要做的工作
		JobA jobA = new JobA();
		JobB jobB = new JobB();
		
		//	建立執行緒並指派(放入)要做的工作
		Thread t1 = new Thread(jobA);
		Thread t2 = new Thread(jobB);
		
		//	設定執行緒名稱
		t1.setName("兔子");
		t2.setName("烏龜");
		
		//	設定執行緒為背景執行緒
		//	t1.setDaemon(true);
		//	t2.setDaemon(true);
		
		//	設定權限
		//	t1.setPriority(1);	//	1~10預設5
		//	t2.setPriority(10);	//	1~10預設5
		t1.setPriority(Thread.MIN_PRIORITY);	//	1
		t2.setPriority(Thread.MAX_PRIORITY);	//	10
		
		//	開始運行 start()
		t1.start();
		t2.start();
		System.out.println("End!");
		
		//	main主程式會等	，User Thread (預設)(前景執行緒)
		//	main主程式不會等，Daermon Thread (預設)(背景執行緒)	
		}
}
