package day09;

public class UserDemo {

	public static void main(String[] args) {
		
		User user1 = new User();	//	建立物件
		user1.setHeight(170.0);		//	設定物件變數
		user1.setWeight(60.0);		//	設定物件變數
		
		User user2 = new User(180.0 , 70.0);	//	建立物件時同步設定物件變數
		
		System.out.println(user2.getHeight() + "," + user2.getWeight());
		System.out.println(user2.getBmi());

	}

}
