package ex08;

class 엘리스 {
	private int 갈증 = 100;
	
	// getter (접근자)
	int 갈증확인() {
		return 갈증;
	}
	
	// setter (설정자)
	void 물마시기() {
		갈증 = 갈증 - 20;
	}
}

public class OopEx01 {

	public static void main(String[] args) {
		엘리스 e = new 엘리스();
		e.물마시기();
		System.out.println("엘리스의 갈증 지수는 : "+e.갈증확인());
	}

}
