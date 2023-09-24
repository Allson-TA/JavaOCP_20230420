package day09;

public class Steak extends Food {
	private String doneness;
	
	public Steak() {
		
	}
	
	public Steak(String name,String doneness) {
		
	}
	
	public Steak(String name, int price, String doneness) {
		super(name, price);
		this.doneness = doneness;
	}

	public String getDoneness() {
		return doneness;
	}

	public void setDoneness(String doneness) {
		this.doneness = doneness;
	}

	@Override
	public String toString() {
		return "Steak [doneness=" + doneness + ", " + super.toString() + "]";
	}
	
	
	
}