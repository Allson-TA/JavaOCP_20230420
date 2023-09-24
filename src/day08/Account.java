package day08;

public class Account {
	
	private String name; // 戶名
	private int balance; // 餘額
	
	String getName() { // 取得戶名
		return name;
	}
	
	void setName(String name) { // 設定戶名
		this.name = name;
	}
	
	void deposit(int amount) { // 存款
		if(amount > 0) {
			this.balance += amount;
			System.out.printf("存款 $%d 成功\n", amount);
		} else {
			System.out.printf("存款 $%d 失敗\n", amount);
		}
	}
	
	void withdraw(int amount) { // 提款
		if(amount > 0 && this.balance >= amount) {
			this.balance -= amount;
			System.out.printf("提款 $%d 成功\n", amount);
		} else {
			System.out.printf("提款 $%d 失敗\n", amount);
		}
	}
	
	void transfer(int amount, Account act) { // 轉帳
		if(amount > 0 && this.balance >= amount) {
			withdraw(amount);    // 本身進行"提款"行為
			act.deposit(amount); // 對方進行"存款"行為
			System.out.printf("%s 轉帳 $%d 給 %s 成功\n", this.name, amount, act.getName());
		} else {
			System.out.printf("%s 轉帳 $%d 給 %s 失敗\n", this.name, amount, act.getName());
		}
	}
	
	void print() { // 列印目前餘額資料
		System.out.printf("%s 餘額: $%d\n", 
						  this.name, this.balance);
	}
	
}