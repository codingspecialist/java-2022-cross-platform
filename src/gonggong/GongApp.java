package gonggong;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class GongApp {
	public static void main(String[] args) {
		
		try {
			URL url = new URL("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&pageNo=1&numOfRows=1000&dataType=json&base_date=20220822&base_time=1500&nx=55&ny=127");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(conn.getInputStream())
			);
			
			StringBuilder sb = new StringBuilder();
			String temp = "";
			
			while( (temp = br.readLine()) != null ) {
				sb.append(temp);
			}
			
			// json 처럼 생긴 String을 RespDto로 변환
			Gson gson = new Gson();
			RespDto respDto = gson.fromJson(sb.toString(), RespDto.class);
			
			String temperature = respDto.getResponse().getBody().getItems().getItem().get(3).getObsrValue();
			System.out.println(temperature);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
