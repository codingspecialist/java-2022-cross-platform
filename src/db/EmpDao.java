package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

// Data, Access, Object
public class EmpDao {
	
	public int 직원수정(int sal, int comm, int empno) {
		int result = -1;
		try {
			// 1. SQL 작성
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE emp SET sal = ?, comm = ? WHERE empno = ?");
			
			// 2. DB 세션
			Connection conn = DBConnection.connection();
			
			// 3. 문장 완성
			PreparedStatement pstmt = conn.prepareStatement(sql.toString());
			// 물음표 번호는 1부터 시작!!
			pstmt.setInt(1, sal);
			pstmt.setInt(2, comm);
			pstmt.setInt(3, empno);
			
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
			
			// 2. DB 세션
			Connection conn = DBConnection.connection();
			
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
			
			// 2. DB 세션
			Connection conn = DBConnection.connection();
			
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
			Connection conn = DBConnection.connection();
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
			Connection conn = DBConnection.connection();
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
