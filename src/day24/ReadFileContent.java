package day24;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

//讀取檔案內容
public class ReadFileContent {

	public static void main(String[] args) throws IOException {
		// 判斷指定檔案是否存在 ?
		File file = new File("src/day24/employee.txt");
		if(!file.exists()) {
			System.out.println(file.getName() + " 檔案不存在, 程式結束!");
			System.exit(1); // 1: 表示人為停止系統
		}
		
		// 讀取檔案內容
		FileReader fr = new FileReader(file);
		int word = 0; // 每一個讀到的字
		StringBuilder sb = new StringBuilder(); // 利用 sb 來收集每一個字
		while((word = fr.read()) != -1) {
			//System.out.print(word);
			//System.out.print((char)word);
			sb.append((char)word);
		}
		System.out.println(sb.length());
		System.out.println(sb);
		
		// 分析內容, 將字串轉陣列
		String[] array = sb.toString().split("\r\n");
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
		
		int sum = 0;
		for(String data : array) {
			String[] row = data.split(" ");
			//System.out.println(row[0]); // 姓名
			System.out.println(row[1]); // 薪資
			sum += Integer.parseInt(row[1]);
		}
		System.out.println("sum = " + sum);
	}

}