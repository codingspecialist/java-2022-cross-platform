package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DeptDao {
	
	private Connection conn;
	
	public DeptDao(Connection conn) {
		this.conn = conn;
	}
	
	
	public int 부서수정(String dname, String loc, int deptno) {
		int result = -1;
		try {
			// 1. SQL 작성
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE dept SET dname = ?, loc = ? WHERE deptno = ?");
			
			// 3. 문장 완성
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			// 물음표 번호는 1부터 시작!!
			pstmt.setString(1, dname);
			pstmt.setString(2, loc);
			pstmt.setInt(3, deptno);
			
			// 4. 문장 전송
			result = pstmt.executeUpdate(); // 문장전송, commit
			
			// result = 1 행 하나 변경, 0 변경 안됨, -1 오류
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int 부서삭제(int deptno) {
		int result = -1;
		try {
			// 1. SQL 작성
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM dept WHERE deptno = ?");
			
			// 3. 문장 완성
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			// 물음표 번호는 1부터 시작!!
			pstmt.setInt(1, deptno);
			
			// 4. 문장 전송
			result = pstmt.executeUpdate(); // 문장전송, commit
			
			// result = 1 행 하나 변경, 0 변경 안됨, -1 오류
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int 부서추가(Dept dept) {
		int result = -1;
		try {
			// 1. SQL 작성
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO dept ");
			sql.append("VALUES(?, ?, ?)");
			
			// 3. 문장 완성
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			// 물음표 번호는 1부터 시작!!
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());

			
			// 4. 문장 전송
			result = pstmt.executeUpdate(); // 문장전송, commit
			
			// result = 1 행 하나 변경, 0 변경 안됨, -1 오류
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public ArrayList<Dept> 부서목록보기() {
		ArrayList<Dept> depts = new ArrayList<>();
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM dept");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Dept dept = new Dept();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));

				depts.add(dept);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return depts;
	} // end of 부서목록보기
	
	public Dept 부서한건보기(int deptno) {
		Dept dept = new Dept();
		try {
			PreparedStatement pstmt = 
					conn.prepareStatement("SELECT * FROM dept WHERE deptno = ?");
			pstmt.setInt(1, deptno);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dept;
	} // end of 부서한건보기
}
