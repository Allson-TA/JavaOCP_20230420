package day06;

public class MultiArrayDemo2 {

	public static void main(String[] args) {
		int[] [] m = {
				{100,90},
				{85,75,65},
				{70,60}
			};
		
		System.out.println(m.length);
		
		//	for-loop來抓每筆資料
		//	i從0開始;小於3;++累計
		for(int i=0;i<m.length;i++) {
			System.out.println(m[i]);	//	m[i]是一維陣列
			for(int k=0;k<m[i].length;k++)
				System.out.printf("[%d][%d] = %d\n" ,i,k,m[i][k]);
		}
		
	}

}
