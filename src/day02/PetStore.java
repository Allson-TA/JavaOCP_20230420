package day02;

// 寵物店
public class PetStore {

	public static void main(String[] args) {
		// 狗的名字
		String dogName = Shiba.name; // 透過 Shiba.name 得到狗的名字
		// 狗的毛色
		String dogColor = Shiba.color; // 透過 Shiba.color 得到狗的毛色
		// 狗的年齡
		int dogAge = Shiba.age; // 透過 Shiba.age 得到狗的年齡
		// 狗的品種
		String dogType = Shiba.class.getSimpleName();
		
		System.out.printf("狗的名字: %s\n", dogName);
		System.out.printf("狗的毛色: %s\n", dogColor);
		System.out.printf("狗的年齡: %s\n", dogAge);
		System.out.printf("狗的品種: %s\n", dogType);
		
		Shiba.eat();
		Shiba.play();
		int ageOfHuman = Shiba.getAgeOfHuman();
		System.out.printf("相當於人類的年齡: %d\n", ageOfHuman);
	}

}