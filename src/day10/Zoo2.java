package day10;

public class Zoo2 {

	public static void main(String[] args) {
		
		Dog dog = new Dog("狗",4);
		Fish fish = new Fish("魚",0);
		Bird bird = new Bird("鳥",2);
		Ostrich ostrich = new Ostrich("鴕鳥",2);
		
		//	多型
		//	Bird [] birds = {bird,ostrich};
		Bird b1 = ostrich;		//	b1.呼叫的只會有Bird的方法
		((Ostrich)b1).spirit();	//	可以利用此方式轉型，印出來就是鴕鳥精神
		b1.move();				//	鴕鳥不會飛
		((Bird)b1).move();		//	這只是代表Bird可以呼叫方法
		
		Ostrich o1 = ostrich;	//	b1.呼叫的會有Bird、ostrich
		o1.spirit();			//	鴕鳥精神
		o1.move();				//	鴕鳥不會飛
	
	}

}
