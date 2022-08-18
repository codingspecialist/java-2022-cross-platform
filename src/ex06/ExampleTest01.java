package ex06;

public class ExampleTest01 {

	public static void main(String[] args) {
		int[] n = {30, 20, 10};
		
		// 사이클 2회
		for(int i=0; i<2; i++) {
			if(n[0] > n[1]) {
				int temp;
				temp = n[0];
				n[0] = n[1];
				n[1] = temp;
			}
			
			if(n[1] > n[2]) {
				int temp;
				temp = n[1];
				n[1] = n[2];
				n[2] = temp;
			}
		}
		
		for(int i=0; i<3; i++) {
			System.out.println(n[i]);
		}
		
	}

}
