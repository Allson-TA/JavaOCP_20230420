package day09;

public class Drink {		//	飲料
	private String name;	//	飲料名稱
	private double price;	//	飲料價格
	private int volume;		//	飲料容量 (毫升)
	private boolean isSugarFree;	//	是否無糖
	
	//	空的建構子
	public Drink() {
		
	}
	
	//	商業方法-折扣
	public void addlyDiscount(double discount) {
		if(discount > 0) {
			this.price *= discount;	//	this.price = this.price * discount;
		}
	}
	
	//	商業方法-無糖折扣
	public void addlySugarFreeDiscountAmount(double discountAmount) {
		if(discountAmount > 0 && this.isSugarFree) {
			this.price = this.price - discountAmount;
		}
	}
	
	
	//	建構子封裝
	public Drink(String name, double price, int volume, boolean isSugarFree) {
		super();
		this.name = name;
		this.price = price;
		this.volume = volume;
		this.isSugarFree = isSugarFree;
	}
	
	//	方法封裝
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isSugarFree() {
		return isSugarFree;
	}
	public void setSugarFree(boolean isSugarFree) {
		this.isSugarFree = isSugarFree;
	}

	@Override
	public String toString() {
		return "Drink [name=" + name + ", price=" + price + ", volume=" + volume + ", isSugarFree=" + isSugarFree + "]";
	}
	
	

	
	
	
	
	
	
}
