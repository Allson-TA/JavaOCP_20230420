package day03;

public class ArrayDemo2 {

	public static void main(String[] args) {
		
		//	建立陣列的時候就直接置入初始資料: 100,90,80,70,60
		//	int[] scores = new int[] {100,90,80,70,60};
		int[] scores = {100,90,80,70,60};	// 與上面相同的簡化寫法，就不用new
		int length = scores.length;	//	取得陣列長度
		
		for(int i=0 ; i<=length-1 ; i++) {
			System.out.println(scores[i]);
		}
	
		for(int i=0 ; i<length ; i++) {
			System.out.println(scores[i]);
		}
		
		//	每次跳兩隔
		for(int i=0 ; i<length ; i+=2) {
			System.out.println(scores[i]);
		}
	}

}
