package day24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

//讀取檔案內容 使用 Java 11
public class ReadFileContent2 {
	public static void main(String[] args) throws IOException {
		// 判斷指定檔案是否存在 ?
		// File file = new File("src/day24/employee.txt");
		Path path = Paths.get("src/day24/employee.txt");
		if(!Files.exists(path)) {
			System.out.println(path.getFileName() + " 檔案不存在, 程式結束!");
			System.exit(1); // 1: 表示人為停止系統
		}
		
		// 讀取檔案內容
		List<String> lines = Files.readAllLines(path);
		System.out.println(lines);
		
		// 計算薪資總和
		int sum = lines.stream()
				//.mapToInt(line -> Integer.parseInt(line.split(" ")[1]))
				.mapToInt(Util::getValue)
				.sum();
		System.out.println(sum);
	}
	
}