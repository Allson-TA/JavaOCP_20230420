package day21;

//	實作一個執行續的工作
public class JobA implements Runnable{
	
	@Override
	public void run() {
		//	取得類別名稱
		String className = getClass().getSimpleName();
		
		//	得到執行續名稱
		String threaName = Thread.currentThread().getName();	
		
		for(int i=1;i<=1000;i++) {
			System.out.printf("%s %s %d\n",className,threaName,i);
		}
	}
	
	
	
}
