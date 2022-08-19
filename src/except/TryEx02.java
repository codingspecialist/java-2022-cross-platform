package except;

class 동물{}

class 강아지 extends 동물{
	void print() {
		System.out.println("강아지");
	}
}

class 말티즈 extends 강아지{}

class 치와와 extends 강아지{}

public class TryEx02 {

	public static void main(String[] args) {

		
		동물 s1 = new 강아지(); // 강아지, 동물
		강아지 s2 = null;
		try {
			s2 = (말티즈)s1;
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
			s2 = new 말티즈();
			// 문자전송
			// 파일로 기록
			// System.out.println("클래스 다운 캐스팅시 문제 발생");
		}	
		
		s2.print();
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
	}

}
