package day12;

public class Pen {
	private String color;
	private int price;
	
	public Pen(String color, int price) {
		this.color = color;
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		Pen p = (Pen)obj;
		// 寫一個比較的判斷
		if(color.equals(p.color) && price == p.price) {
			return true;
		} else {
			return false;
		}
	}


	@Override
	public int hashCode() {
		return 7*17*price+color.hashCode();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pen [color=" + color + ", price=" + price + "]";
	}
	
}