package communication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class NaverProgram {
	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://www.naver.com");
			HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(conn.getInputStream())
			);
			
			String temp = "";
			
			while( (temp = br.readLine()) != null ) {
				System.out.println(temp);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
