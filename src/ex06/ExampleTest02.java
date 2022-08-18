package ex06;

public class ExampleTest02 {

	public static void main(String[] args) {
		// 모음 : a e i o u
		// 자음 : 모음을 제외한 모든 것
		
		char ch = 'a'; // 2Byte
		
		// 라이브러리 사용해서 ch에 들어오는 값을 소문자로 변경
		
		if(ch=='a') {
			System.out.println("모음입니다.");
		}else if(ch=='e') {
			System.out.println("모음입니다.");
		}else if(ch=='i') {
			System.out.println("모음입니다.");
		}else if(ch=='o') {
			System.out.println("모음입니다.");
		}else if(ch=='u') {
			System.out.println("모음입니다.");
		}else {
			System.out.println("자음입니다.");
		}
	}

}
