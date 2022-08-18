package ex07;

class 계산기 { // 메서드는 클래스 하위에 생성!!
	
	int num = 10;
	static int sum = 20;
	
	void 더하기(){
		System.out.println("더하기 메서드가 호출되었습니다");
	}
	
	int 빼기(int a, int b) {
		return a-b;
	}
	
	int 곱하기(int a, int b) {
		return a*b;
	}
	
	int 나누기(int a, int b) {
		return a/b;
	}
}

public class MethEx01 {

	public static void main(String[] args) {
		계산기 g = new 계산기();
		g.더하기();
		
		int result1 = g.빼기(10, 5);
		System.out.println("빼기의 결과는 : "+result1);
		
		int result2 = g.곱하기(10, 5);
		System.out.println("곱하기의 결과는 : "+result2);
		
		int result3 = g.나누기(10, 5);
		System.out.println("나누기의 결과는 : "+result3);
	}

}





