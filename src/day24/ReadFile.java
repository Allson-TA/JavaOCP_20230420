package day24;

import java.io.File;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		File file = new File("src/day24/age.txt");
		// 檔案是否存在 ?
		if(file.exists()) {
			System.out.println(file.getName() + " 檔案存在");
		} else {
			System.out.println(file.getName() + " 檔案不存在");
			// 建立檔案
			try {
				boolean isOk = file.createNewFile();
				if(isOk) {
					System.out.println(file.getName() + " 建立成功 !");
				} else {
					System.out.println(file.getName() + " 建立不成功 !");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}