package day26;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

//	批次新增
public class AddBatchStudent {

	public static void main(String[] args) throws IOException, SQLException {
		
		//	1. 讀取score.txt的檔案內容
		Path filePath = Paths.get("src\\day26/score.txt");
		List<String> lines = Files.readAllLines(filePath);
		System.out.println("資料筆數: "+ lines.size());
		System.out.println("資料內容: "+ lines);
		
		// 2. MySQL 資料連線設定
		String dbUrl = "jdbc:mysql://localhost:3306/demo?allowPublicKeyRetrieval=true&serverTimezone=Asia/Taipei";
		String username = "root";
		String password = "allson";
		String driverName = "com.mysql.cj.jdbc.Driver";
		
		//	3. 新增student紀錄的SQL
		String sql = "insert into student(score1,score2,score3,score4) values(?,?,?,?)";
		
		try(Connection conn = DriverManager.getConnection(dbUrl, username, password);
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			pstmt.clearBatch();
			
			for(String line : lines) {
				String[] arr = line.split(",");
				int score1 = Integer.parseInt(arr[0].trim());	//trim去掉左右空白
				int score2 = Integer.parseInt(arr[1].trim());
				int score3 = Integer.parseInt(arr[2].trim());
				int score4 = Integer.parseInt(arr[3].trim());
				pstmt.setInt(1, score1);
				pstmt.setInt(2, score2);
				pstmt.setInt(3, score3);
				pstmt.setInt(4, score4);
				pstmt.addBatch();
				
			}
			
			int[] resultArray = pstmt.executeBatch();
			System.out.println("批次新增完成");
			System.out.println(Arrays.toString(resultArray));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
