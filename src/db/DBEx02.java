package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBEx02 {
	
	static Connection connection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"SCOTT", 
					"TIGER"
			);
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		try {
			// 1. 디비연결
			Connection conn = connection();
			
			// 2. 문장완성
			PreparedStatement pstmt = 
					conn.prepareStatement("SELECT empno, ename FROM emp");
			
			// 3. 문장전송
			ResultSet rs = pstmt.executeQuery();
			
			// 4. 커서 false 때까지 내리기
			while(rs.next()) {
				System.out.println(rs.getInt("empno")+" : "+rs.getString("ename"));
			}

		} catch (Exception e) {
			
		}
		

	}

}



