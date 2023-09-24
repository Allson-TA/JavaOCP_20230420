package day13_3;

public enum USCoin {
	
	//	PENNY:一美分,NICKLE:五美分,DIME:10美分,QUARTER:25美分
	PENNY(1),NICKLE(5),DIME(10),QUARTER(25);
	
	
	private int value;
	
	private USCoin(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
}
