package day22;

public class Account {
	private int balance;
	private Object boss = new Object();
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	// 提款作業
	public synchronized void withdraw(int amount) {
		String tName = Thread.currentThread().getName();
		
		synchronized (boss) {
			
		}
		
		// 取得最新帳戶餘額
		int currentBalance = balance;
		System.out.printf("%s 開始提款 $%d 帳戶餘額 $%d\n", tName, amount, currentBalance);
		// 模擬提款時間
		for(int i=0;i<=10000000;i++);
		if(currentBalance >= amount) {
			// 將餘額減去提款金額
			balance = balance - amount;
			// 印出交易結果
			System.out.printf("%s 提款 $%d 成功, 帳戶餘額 $%d\n", tName, amount, balance);
		} else {
			// 印出交易結果
			System.out.printf("%s 提款 $%d 失敗, 帳戶餘額 $%d\n", tName, amount, balance);
		}
		System.out.printf("%s 提款完成\n\n", tName);
	}
	
	
}