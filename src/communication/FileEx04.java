package communication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;

public class FileEx04 {

	//       ./ 현재경로
	//      ../ 바로 위폴더
	//       / 최상위 폴더
	public static void main(String[] args) {
		File file = new File("src/data.txt");
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
