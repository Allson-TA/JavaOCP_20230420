package day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SelectStudent {
	public static void main(String[] args) {
		// MySQL 資料連線設定
		String dbUrl = "jdbc:mysql://localhost:3306/demo?allowPublicKeyRetrieval=true&serverTimezone=Asia/Taipei";
		String username = "root";
		String password = "allson";
		String driverName = "com.mysql.cj.jdbc.Driver";
		
		// 查詢 student 資料
		String sql = "select id, score1, score2, score3, score4 from student";
		
		try(Connection conn = DriverManager.getConnection(dbUrl, username, password);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql)) {
			
			// 取得資料表欄位名
			ResultSetMetaData md = rs.getMetaData();
			for(int i=1; i<=md.getColumnCount();i++) {
				System.out.printf("%10s", md.getColumnLabel(i));
			}
			
			// 分隔線
			System.out.println();
			for(int i=0;i<50;i++) {
				System.out.print("-");
			}
			System.out.println();
			
			// 取得資料表內容
			List<Student> students = new ArrayList<>();
			while (rs.next()) {
				int id = rs.getInt("id");
				int score1 = rs.getInt("score1");
				int score2 = rs.getInt("score2");
				int score3 = rs.getInt("score3");
				int score4 = rs.getInt("score4");
				
				Student student = new Student();
				student.setId(id);
				student.setScore1(score1);
				student.setScore2(score2);
				student.setScore3(score3);
				student.setScore4(score4);
				
				students.add(student);
			}
			
			//System.out.println(students);
			for(Student student : students) {
				System.out.printf("%10d%10d%10d%10d%10d\n", 
								  student.getId(), 
								  student.getScore1(), student.getScore2(), student.getScore3(), student.getScore4());
			}
			
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
		
	}
}