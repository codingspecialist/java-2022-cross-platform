package ex09;


public class MethodEx01 {
	
	static int add(int a, int b){
		return a+b;
	}
	static int minus(int a, int b){
		return a-b;
	}
	
	public static void main(String[] args) {
		int r1 = add(10, 5);  // 리턴을 하면 호출문이 결과값으로 변경됨
		int r2 = minus(r1,10);
		System.out.println(r2);
		
	}

}



