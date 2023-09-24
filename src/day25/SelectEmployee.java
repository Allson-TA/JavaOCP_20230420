package day25;

//	用java8才可以執行

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectEmployee {

	public static void main(String[] args) throws Exception {
		// 查詢 MySQL 中的 employee 資料表內容
		String dbUrl = "jdbc:mysql://localhost:3306/demo?useSSL=false&serverTimezone=Asia/Taipei";
		String username = "root";
		String password = "allson";
		String driverName = "com.mysql.cj.jdbc.Driver";
		
		// 1. 註冊 driver (JDBC 4.0之後可以不用寫)
		Class.forName(driverName);
		
		// 2. 建立連線
		Connection conn = DriverManager.getConnection(dbUrl, username, password);
		
		// 3. 建立敘述物件(可以編寫 SQL 語法)
		Statement stmt = conn.createStatement();
		String sql = "select name, salary, title from employee";
		
		// 4. 取得資料結果
		ResultSet rs = stmt.executeQuery(sql);
		
		// 5. 瀏覽資料
		while (rs.next()) {  // 自動輪詢
			String name = rs.getString("name");
			int salary = rs.getInt("salary");
			String title = rs.getString("title");
			System.out.printf("%s\t%d\t%s\n", name, salary, title);
		}
		
		// 6. 依序關閉資源
		rs.close();
		stmt.close();
		conn.close();

	}

}