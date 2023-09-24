package day25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectEmployee2 {

	public static void main(String[] args) throws ClassNotFoundException {
		// 查詢 MySQL 中的 employee 資料表內容
		String dbUrl = "jdbc:mysql://localhost:3306/demo?useSSL=false&serverTimezone=Asia/Taipei";
		String username = "root";
		String password = "allson";
		String driverName = "com.mysql.cj.jdbc.Driver";
		
		// 註冊 driver (JDBC 4.0之後可以不用寫)
		Class.forName(driverName);
		
		String sql = "select name, salary, title from employee";
		
		// 利用 try-with-resources 來自動關閉資源
		try(Connection conn = DriverManager.getConnection(dbUrl, username, password);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);) {
			
			while (rs.next()) {  // 自動輪詢
				String name = rs.getString("name");
				int salary = rs.getInt("salary");
				String title = rs.getString("title");
				System.out.printf("%s\t%d\t%s\n", name, salary, title);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}