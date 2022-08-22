package communication;

import java.io.InputStream;
import java.io.InputStreamReader;

public class InputEx02 {
	public static void main(String[] args) {
		char[] dataArr = new char[4];
		
		try {
			InputStream in = System.in;			
			InputStreamReader ir = new InputStreamReader(in);
			
			ir.read(dataArr);
			
			for(int i=0; i<dataArr.length; i++) {
				System.out.print(dataArr[i]);
			}
			
			
			
		} catch (Exception e) {
			
		}
	}
}
