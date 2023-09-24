package day08;

import java.util.Arrays;

public class AccountTest3 {

	public static void main(String[] args) {
		
		Account act1 = new Account();
		act1.setName("John");act1.deposit(100);
		
		Account act2 = new Account();
		act2.setName("Mary");act2.deposit(200);
		
		Account act3 = new Account();
		act3.setName("Helen");act3.deposit(300);
		
		Account[] accounts = {act1,act2,act3};
		
		for(int i=0;i<accounts.length;i++) {
			accounts[i].print();
		}
		
		for(Account act : accounts) {
			act.print();
		}
		
		Arrays.stream(accounts).forEach(act -> act.print());
		
		Arrays.stream(accounts).forEach(Account :: print);
	}

}
