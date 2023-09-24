package day10;

public class Bird extends Animal {
 
	public Bird() {
		
	}
	
	public Bird(String name, int legs) {
		super(name,legs);
	}
	
	public void move() {
		System.out.println("鳥會飛");
	}
	
	 
}
 
