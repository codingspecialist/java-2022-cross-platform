package communication;

import java.io.InputStream;

public class InputEx01 {
	public static void main(String[] args) {
		// 바이트 스트림
		
		InputStream in = System.in;
		
		try {
			int number = in.read();
			System.out.println((char)number);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
