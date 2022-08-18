package ex05;

// 캐스팅 (엄청 중요함)
public class CastEx01 {

	public static void main(String[] args) {
		int num = 10; // 4Byte
		double d1 = num; // 자연스러운(묵시적) 형변환 = up casting
		System.out.println(d1);
		
		double d2 = 20.5;
		int num2 = (int)d2; // 자연스럽지 않은(명시적) 형변환 = down casting
		System.out.println(num2);
	}

}
