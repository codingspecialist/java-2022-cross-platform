package communication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class NaverProgram2 {
	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EB%82%A0%EC%94%A8");
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
