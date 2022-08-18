package ex06;

public class WhileEx02 {

	public static void main(String[] args) {
		// 무한루프를 돌면서 1,2,3,4,5,6~~~ 번호를 출력하는
		// 프로그램을 만들어라.
		// 단, 숫자가 10 출력되면 멈춰라.(break)
		
		int sum = 0;
		sum = sum +1;

		
		int n = 0;
		
		while(true) {
			n = n + 1;
			System.out.println(n);
			
			if(n == 10) {
				break;
			}
		}
	}

}
