package day25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class SelectEmployee4 {

	public static void main(String[] args) throws ClassNotFoundException {
		// 查詢 MySQL 中的 employee 資料表內容
		String dbUrl = "jdbc:mysql://localhost:3306/demo?useSSL=false&serverTimezone=Asia/Taipei";
		String username = "root";
		String password = "allson";
		String driverName = "com.mysql.cj.jdbc.Driver";
		
		// 註冊 driver (JDBC 4.0之後可以不用寫)
		Class.forName(driverName);
		
		// 尋找薪資 >= ? 的資料
		//String sql = "select name, salary, title from employee where salary >= ? and title = ?";
		String sql = "select name, salary, title from employee where salary >= ? and title in (?, ?)";
		
		// 利用 try-with-resources 來自動關閉資源
		// 使用 PreparedStatement 來防止 SQL Injection 的攻擊
		try(Connection conn = DriverManager.getConnection(dbUrl, username, password);
			PreparedStatement pstmt = conn.prepareStatement(sql);) {
			
			pstmt.setInt(1, 30000);
			pstmt.setString(2, "Developer");
			pstmt.setString(3, "Tester");
			
			try(ResultSet rs = pstmt.executeQuery();){
				while (rs.next()) {  // 自動輪詢
					String name = rs.getString("name");
					int salary = rs.getInt("salary");
					String title = rs.getString("title");
					System.out.printf("%s\t%d\t%s\n", name, salary, title);
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}