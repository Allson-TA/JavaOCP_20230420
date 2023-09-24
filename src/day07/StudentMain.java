package day07;

public class StudentMain {

	public static void main(String[] args) {
		// 透過 new 來建立物件
		
		Student s1 = new Student();
		s1.name = "John";	//	設定物件資料
		s1.score = 90;		//	設定物件資料
		System.out.println(s1.name);
		System.out.println(s1.score);
		System.out.println(s1.isPass());
		
		Student s2 = new Student();
		s2.name = "Mary";	//	設定物件資料
		s2.score = 45;		//	設定物件資料
		System.out.println(s2.name);
		System.out.println(s2.score);
		System.out.println(s2.isPass());
	}

}
