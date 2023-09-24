package day08;

public class AccountTest2 {

	public static void main(String[] args) {
		
		Account act1 = new Account();
		act1.setName("John");act1.deposit(100);
		
		Account act2 = new Account();
		act2.setName("Mary");act2.deposit(100);
		
		Account act3 = new Account();
		act3.setName("Helen");act3.deposit(100);
		
		// 轉帳
		// act1 轉 $70 給 act2
		act1.transfer(70, act2);
		
		act1.print();
		act2.print();
		act3.print();

	}

}