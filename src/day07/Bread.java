package day07;

public class Bread {
	String type;	//	麵包種類
	int weight;		//	麵包重量(克)
	static final int pricePerGram=3;	//	每克麵包的價格(單位:新台幣)
	
	int getPrice() {	//	麵包價格
		return weight * pricePerGram;
	}
}
