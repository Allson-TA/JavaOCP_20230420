package day22;

public class ATM {

	public static void main(String[] args) {
		// 帳戶(資源)
		Account account = new Account(10000);
		// 工作(共用一個 account 資源)
		Withdraw w1 = new Withdraw(account, 5000);
		Withdraw w2 = new Withdraw(account, 4000);
		Withdraw w3 = new Withdraw(account, 2000);
		// 執行緒
		Thread t1 = new Thread(w1,"T1");
		Thread t2 = new Thread(w2,"T2");
		Thread t3 = new Thread(w3,"T3");
		// 啟動
		t1.start();
		t2.start();
		t3.start();
		
		StringBuffer s1;
		StringBuilder s2;
		
	}

}