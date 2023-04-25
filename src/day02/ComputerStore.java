package day02;

public class ComputerStore {

	public static void main(String[] args) {
		double cpu = 3.1;
		int ram = 32;
		int ssd = 5 * 1024; // 5T
		int price = Computer.getPrice(cpu, ram, ssd);
		System.out.printf("電腦價格: %,d\n", price);
		Computer.printComputer();

	}

}