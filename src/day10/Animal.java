package day10;

public class Animal {
 
	private String name;
	 
	private int legs;
	 
	public Animal() {
	}
	 
	public Animal(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}
	 
	public void move() {
		System.out.println("動物會動");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	 
}
 
