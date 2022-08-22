package communication;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileEx03 {

	public static void main(String[] args) {
		try {

			File file = new File("d:\\log.txt");
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = 
					new BufferedWriter(fw);
			bw.append("hello2\n");
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
