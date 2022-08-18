package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

// Data, Access, Object
public class EmpDao {
	
	private Connection conn;
	
	public EmpDao(Connection conn) {
		this.conn = conn;
	}
	
	public  int 직원수정(int empno, String ename) {
		int result = -1;
		try {
			// 1. SQL 작성
			StringBuilder sql = new StringBuilder();
			sql.append("UPDAT emp SET ename = ? WHERE empno = ?");
			
			// 3. 문장 완성
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			// 물음표 번호는 1부터 시작!!
			pstmt.setString(1, ename);
			pstmt.setInt(2, empno);
			
			// 4. 문장 전송
			result = pstmt.executeUpdate(); // 문장전송, commit
			
			// result = 1 행 하나 변경, 0 변경 안됨, -1 오류
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public  int 직원수정(int empno, int deptno) {
		int result = -1;
		try {
			// 1. SQL 작성
			StringBuilder sql = new StringBuilder();
			sql.append("UPDAT emp SET deptno = ? WHERE empno = ?");
			
			// 3. 문장 완성
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			// 물음표 번호는 1부터 시작!!
			pstmt.setInt(1, deptno);
			pstmt.setInt(2, empno);
			
			// 4. 문장 전송
			result = pstmt.executeUpdate(); // 문장전송, commit
			
			// result = 1 행 하나 변경, 0 변경 안됨, -1 오류
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int 직원삭제(int empno) {
		int result = -1;
		try {
			// 1. SQL 작성
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM emp WHERE empno = ?");
			
			// 3. 문장 완성
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			// 물음표 번호는 1부터 시작!!
			pstmt.setInt(1, empno);
			
			// 4. 문장 전송
			result = pstmt.executeUpdate(); // 문장전송, commit
			
			// result = 1 행 하나 변경, 0 변경 안됨, -1 오류
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int 직원추가(Emp emp) {
		int result = -1;
		try {
			// 1. SQL 작성
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO emp ");
			sql.append("VALUES(?, ?, ?, ?, sysdate, ?, ?, ?)");
			
			// 3. 문장 완성
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			// 물음표 번호는 1부터 시작!!
			pstmt.setInt(1, emp.getEmpno());
			pstmt.setString(2, emp.getEname());
			pstmt.setString(3, emp.getJob());
			pstmt.setInt(4, emp.getMgr());
			pstmt.setInt(5, emp.getSal());
			pstmt.setInt(6, emp.getComm());
			pstmt.setInt(7, emp.getDeptno());
			
			// 4. 문장 전송
			result = pstmt.executeUpdate(); // 문장전송, commit
			
			// result = 1 행 하나 변경, 0 변경 안됨, -1 오류
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public ArrayList<Emp> 직원목록보기() {
		ArrayList<Emp> emps = new ArrayList<>();
		try {

			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM emp");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Emp emp = new Emp();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setHiredate(rs.getTimestamp("hiredate"));
				emp.setSal(rs.getInt("sal"));
				emp.setComm(rs.getInt("comm"));
				emp.setDeptno(rs.getInt("deptno"));
				emps.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emps;
	} // end of 직원목록보기
	
	public Emp 직원한건보기(int empno) {
		Emp emp = new Emp();
		try {
			PreparedStatement pstmt = 
					conn.prepareStatement("SELECT * FROM emp WHERE empno = "+empno);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setHiredate(rs.getTimestamp("hiredate"));
				emp.setSal(rs.getInt("sal"));
				emp.setComm(rs.getInt("comm"));
				emp.setDeptno(rs.getInt("deptno"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	} // end of 직원한건보기
	
	
}
