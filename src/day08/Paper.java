package day08;

public class Paper {

	private int price;		//	價格
	private Color color;	//	顏色
	private Size size;		//	尺寸
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	
	public String toString() {
		return color.getColorName()+"-"+size.getSizeName()+"$"+price;
	}
	
	public void print() {
		System.out.println(color.getColorName() + "-" + size.getSizeName() + " $" + price);
	}
}
