package day07;


//	這是一個 Student的類
public class Student {
	
	String name;	//	物件變數 / 屬性 / 欄位 / 資產
	int score;		//	考試分數
	
	boolean isPass() {	//	判斷分數是否及格
		return score >=60;
	}
	
}
