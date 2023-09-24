package day11;

public class Espresso extends Coffee {
	
	private int shots;	//	濃縮次數
	
	public Espresso(String name, int price,int shots) {
		super(name, price);
	}

	public int getShots() {
		return shots;
	}

	public void setShots(int shots) {
		this.shots = shots;
	}

	@Override
	public void prepare() {
		System.out.printf("開始準備 %d 次濃縮的 %s 咖啡\n",shots,getName());
	}
	
	
}
