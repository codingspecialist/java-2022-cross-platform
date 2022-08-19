package except;

import java.io.IOException;
import java.sql.SQLException;
import java.util.zip.DataFormatException;

class Car {
	String name = "소나타";
	
	void namePrint() {
		System.out.println(name);
	}
}

public class TryEx04 {
	
	public static void start(Car c) throws NullPointerException {
		c.namePrint();	
	}
	
	public static void start2(Car c) throws IOException {
		c.namePrint();	
	}
	
	public static void start3(Car c) throws SQLException {
		c.namePrint();	
	}
	
	public static void start4(Car c) throws DataFormatException {
		c.namePrint();	
	}
	
	public static void main(String[] args) {
		try {
			start(null);
		} catch (RuntimeException e) {
			System.out.println("런타임 ㅡㅡㅡㅡㅡ");
		}
		
		try {
			start2(null);
			try {
				start3(null);
				try {
					start4(null);
				} catch (DataFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e1) {
			System.out.println("컴파일에러 ----");
		}
		

		
//		try {
//			start(null);
//			start2(null);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (NullPointerException e) {
//			e.printStackTrace();
//		}
		
		try {
			start(null);
			start2(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		for(int i=0; i<3; i++) {
			System.out.println(i);
		}
		
	}
}
