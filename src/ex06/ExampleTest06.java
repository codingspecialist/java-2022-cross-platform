package ex06;

public class ExampleTest06 {

	public static void main(String[] args) {
		// 2와 100사이에 있는 모든 소수를 찾는 프로그램 만들기
		
		// k=2, j는0번
		// k=3, j는1번
		// k=4, j는2번
		// k=5, j는3번                                                                                                                                                                                                                                                                                
		for(int k=2; k<=100; k++) {
			int checkSum = 0;
			for(int j=2; j<k; j++) { 
				if(k % j == 0) { // 소수가 아니다.
					checkSum++;
				}
			}
			if(checkSum == 0) {
				System.out.println(k+"는 소수입니다.");	
			}
		}
		
		// 1사이클 k=2
		
		// 2사이클 k=3
		// k % 2 == 0 true 소수가 아님, false 소수 (false)
		
		// 3사이클 k=4
		// k % 2 == 0 true 소수가 아님, false 소수 (true)
		// k % 3 == 0 true 소수가 아님, false 소수 (false)
		                                                              // true
		
		// 4사이클 k=5
		// k % 2 == 0 true 소수가 아님, false 소수 (false)
		// k % 3 == 0 true 소수가 아님, false 소수 (false)
		// k % 4 == 0 true 소수가 아님, false 소수 (false)
		                                                              // false  
		
		// 2 ~ 6
		// k % 2 == 0 소수가 아님
		// k % 3 == 0 소수가 아님
		// k % 4 == 0 소수가 아님
		// k % 5 == 0 소수가 아님
		// k % 6 == 0 소수가 아님

	}

}
