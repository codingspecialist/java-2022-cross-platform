package communication;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class OutputEx01 {

	public static void main(String[] args) {
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(System.out)
		);
		try {
			bw.write("ㅇ런임렁ㄴ머리ㅏㅁ");
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
