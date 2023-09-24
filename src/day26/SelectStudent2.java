package day26;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SelectStudent2 {
	public static void main(String[] args) {
		// MySQL 資料連線設定
		String dbUrl = "jdbc:mysql://localhost:3306/demo?allowPublicKeyRetrieval=true&serverTimezone=Asia/Taipei";
		String username = "root";
		String password = "allson";
		String driverName = "com.mysql.cj.jdbc.Driver";
		
		// 查詢 student 資料並排名次
		// 透過預儲程序 store procedure
		/*
		 	CREATE DEFINER=`root`@`localhost` PROCEDURE `myrank`()
			BEGIN
			SET @rank = 0;
			SELECT (@rank := @rank + 1) as myrank, id, score1, score2, score3, score4, (score1 + score2 + score3 + score4) as total_score
			FROM demo.student
			ORDER BY total_score DESC;
			END
		 */
		try(Connection conn = DriverManager.getConnection(dbUrl, username, password);
			CallableStatement stmt = conn.prepareCall("{call myrank()}");) {
			
			ResultSet rs = stmt.executeQuery();
			// 取得資料表欄位名
			ResultSetMetaData md = rs.getMetaData();
			for(int i=1; i<=md.getColumnCount();i++) {
				String label = md.getColumnLabel(i);
				if(label.equals("total_score")) {
					label = "total";
				}
				System.out.printf("%10s", label);
			}
			
			// 分隔線
			System.out.println();
			for(int i=0;i<70;i++) {
				System.out.print("-");
			}
			System.out.println();
			
			// 取得資料表內容
			List<Student> students = new ArrayList<>();
			while (rs.next()) {
				int myrank = rs.getInt("myrank");
				int id = rs.getInt("id");
				int score1 = rs.getInt("score1");
				int score2 = rs.getInt("score2");
				int score3 = rs.getInt("score3");
				int score4 = rs.getInt("score4");
				int totalScore = rs.getInt("total_score");
				
				Student student = new Student();
				student.setMyrank(myrank);
				student.setId(id);
				student.setScore1(score1);
				student.setScore2(score2);
				student.setScore3(score3);
				student.setScore4(score4);
				student.setTotalScore(totalScore);
				
				students.add(student);
			}
			
			//System.out.println(students);
			for(Student student : students) {
				System.out.printf("%10d%10d%10d%10d%10d%10d%10d\n", 
								  student.getMyrank(), student.getId(), 
								  student.getScore1(), student.getScore2(), student.getScore3(), student.getScore4(),
								  student.getTotalScore());
			}
			
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
		
	}
}