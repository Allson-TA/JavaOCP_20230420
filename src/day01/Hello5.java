package day01;

public class Hello5 {

	public static void main(String[] args) {
		int chinese = 100;
		int math = 90;
		int english = 78;
		//	求總分
		printSum(chinese,math,english);
		//	求總分
		printAvg(chinese,math,english);
		//	求總分與平均
		printSumAndAvg(chinese,math,english);
		
	}
	
		public static void printSum(int chinese,int math,int english) {
			int sum = chinese + math + english;
			System.out.printf("總分: %d\n",sum);
		}
		
		public static void printAvg(int chinese,int math,int english) {
			int sum = chinese + math + english;
			double avg = sum / 3.0;
			System.out.printf("平均: %1f\n",avg);
		}//ss
		
		public static void printSumAndAvg(int chinese,int math,int english) {
			printSum(chinese,math,english);
			printAvg(chinese,math,english);
		}
		
		
	

}
