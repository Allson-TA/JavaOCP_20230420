package day22;

public class Spelling {

	public static void main(String[] args) throws InterruptedException {
		
		//	主執行緒拚 A、D
		//	子執行緒拚 B、C
		//	最後結果ABCD
		System.out.println("主執行緒 A");
		
		Thread t1 = new Thread(()->{
			System.out.println("子執行緒 B");
			
			//	執行緒等五秒
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			System.out.println("子執行緒 C");
		});
		
		t1.start();
		
		//	t1.Join() 等t1執行緒的工作做完之後，才往下做
		//	t1.join();
		t1.join(2000);	//	兩秒沒有做完就不等了
		
		System.out.println("主執行緒 D");
		System.out.println("Game Over!");
	}

}
