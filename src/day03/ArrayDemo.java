package day03;

public class ArrayDemo {

	public static void main(String[] args) {
		
		//	建構一個int[]陣列
		int[] scores = new int[5];
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
		System.out.printf("陣列長度: %d\n" , scores.length);
		
		//	將資料放入到陣列中
		scores[0] = 100;
		scores[1] = 90;
		scores[2] = 80;
		scores[3] = 70;
		scores[4] = 60;
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
	}

}
