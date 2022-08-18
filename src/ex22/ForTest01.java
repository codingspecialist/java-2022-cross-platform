package ex22;

public class ForTest01 {

	public static void main(String[] args) {
		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		String c = "*";
		
		for (int i = 1; i < 6; i++) {
			for(int k=0; k<i; k++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
