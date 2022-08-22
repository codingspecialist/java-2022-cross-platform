package communication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileEx01 {

	public static void main(String[] args) {
		File file = new File("d:\\data.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = 
					new BufferedReader(fr);
			
			System.out.println(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
