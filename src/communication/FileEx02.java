package communication;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileEx02 {

	public static void main(String[] args) {
		File file = new File("d:\\log.txt");
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = 
					new BufferedWriter(fw);
			
			bw.write("fjdklsajlk");
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
