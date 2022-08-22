package communication;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputEx03 {
	
	public static BufferedReader read() {
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in)
		);
		return br; 
	}
	
	public static void print(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		
		
		try {
			String s = "";
			if((s = read().readLine()) != null ) {
				print(s);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
