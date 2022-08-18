package service;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	// public이 붙어야 다른 패키지에서 import 가능
	public static Connection connection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"SCOTT", 
					"TIGER"
			);
			conn.setAutoCommit(false);
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
