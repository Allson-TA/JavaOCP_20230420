package day26;

/*
 student
 id = 編號
 score1 = 分數1
 score2 = 分數2
 score3 = 分數3
 score4 = 分數4
  
 24位進入決賽
 -->分析排名
 -->擅長的題型、順序
 -->平均每題的分數
 -->其他統計項目
  
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStudentTable {

	public static void main(String[] args) throws ClassNotFoundException {
		// MySQL 資料連線設定
		String dbUrl = "jdbc:mysql://localhost:3306/demo?allowPublicKeyRetrieval=true&serverTimezone=Asia/Taipei";
		String username = "root";
		String password = "allson";
		String driverName = "com.mysql.cj.jdbc.Driver";
		
		// 建立 student 資料表的 sql
		String sql = "create table if not exists student ("
				+ "id int not null AUTO_INCREMENT, "
				+ "score1 int, "
				+ "score2 int, "
				+ "score3 int, "
				+ "score4 int, "
				+ "primary key (id)"
				+ ")";
		
		// 1. 註冊 driver (JDBC 4.0之後可以不用寫)
		Class.forName(driverName);
		
		
		try(Connection conn = DriverManager.getConnection(dbUrl, username, password);
			Statement stmt = conn.createStatement();) {
			// 執行一個新增資料表的 sql, 使用 executeUpdate
			// result = 1 表示新增成功, result = 0 表示資料表已經存在不用再新增
			int result = stmt.executeUpdate(sql);
				System.out.println("result = " + result);
				System.out.println("Student 表示資料表已經存在不用再新增");

			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}