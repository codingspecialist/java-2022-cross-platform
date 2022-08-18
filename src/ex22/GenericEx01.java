package ex22;

class Box<T>{
	T data;
}

public class GenericEx01 {
	
	// num = 1 이면 Data1으로 다운캐스팅해
	// num = 2 이면 Data2로 다운캐스팅해
	static Box getData(int num) {
		if(num == 1) {
			return new Box<>();
		}else {
			return new Box<>();
		}
	}

	public static void main(String[] args) {
		
		Box<String> box1 = new Box<>();
		box1.data = "1";
		Box<Integer> box2 = new Box<>();
		box2.data = 1;

		
		Box<Integer> b1 = getData(1);
		b1.data = 1;
		
		System.out.println(b1.data);
		
		Box<String> b2 = getData(2);
		b2.data = "홍길동";
		
		System.out.println(b2.data);
	}

}
