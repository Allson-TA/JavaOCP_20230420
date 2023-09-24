package day10;

public class Zoo {

	public static void main(String[] args) {
		
		Dog dog = new Dog("狗",4);
		Fish fish = new Fish("魚",0);
		Bird bird = new Bird("鳥",2);
		Ostrich ostrich = new Ostrich("鴕鳥",2);
		
		System.out.printf("%s 有 %d條腿\n",dog.getName(),dog.getLegs());
		System.out.printf("%s 有 %d條腿\n",fish.getName(),fish.getLegs());
		System.out.printf("%s 有 %d條腿\n",bird.getName(),bird.getLegs());
		System.out.printf("%s 有 %d條腿\n",ostrich.getName(),ostrich.getLegs());
		
		dog.move();
		fish.move();
		bird.move();
		ostrich.move();
		ostrich.spirit();	//	鴕鳥精神
		
	}

}
