package service;

import java.sql.Connection;
import java.util.ArrayList;

public class MyApp {

	public static void main(String[] args) {
		Connection conn = DBConnection.connection();
		EmpDao empDao = new EmpDao(conn);
		DeptDao deptDao = new DeptDao(conn);
		
		MyService myService = new MyService(empDao,deptDao, conn);
		
		// given
		Dept dept = new Dept(80, "TF팀", "부산");
		ArrayList<Integer> empnos = new ArrayList<>();
		empnos.add(7521);
		empnos.add(7566);

		myService.TF팀창설(dept, empnos);
		
		
		
		
	}
}
