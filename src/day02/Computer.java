package day02;

public class Computer {

	public static double cpuSpeed;	//	CPU速度(GHz)
	public static int ramCapacity;	//	CPU速度(G)
	public static int ssdCapacity;	//	CPU速度(G)
	public static int price;	//	總價格
	
	//	單位成本
	//	若屬性有 final 修飾，則屬性名稱必須全部大寫
	//	private --> 代表只有Computer這個讀的到，其他都無法存取
	private static final int CPU_UNIT_COST = 2500;	//	每0.1(GHz)
	private static final int RAM_UNIT_COST = 60;	//	每1G
	private static final int SSD_UNIT_COST = 3;	//	每1G
	
	//	計算電腦價格
	public static int getPrice(double cpu , int ram , int ssd) {
		cpuSpeed = cpu;
		ramCapacity = ram;
		ssdCapacity = ssd;
		price = (int) (cpuSpeed * CPU_UNIT_COST + ramCapacity * RAM_UNIT_COST + ssdCapacity * SSD_UNIT_COST);
		return price;
	}
	
	//	印出電腦資訊
	public static void printComputer() {
		System.out.printf("CPU: %.1f RAM: %dG SSD: %dG Price:%,d\n", 
				cpuSpeed, ramCapacity, ssdCapacity, price);
		
	}
}
