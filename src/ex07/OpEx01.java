package ex07;

// 1. 상태(변수)를 만들어야 한다. (위치 : 클래스 하위)
class People {
	String name = "홍길동";
	String gender = "남";
	int age = 20;
	int money = 1000;
}

public class OpEx01 {
	
	public static void main(String[] args) {
		People p = new People();
		People p2 = new People();
		
		System.out.println(p.name);
		System.out.println(p.gender);
		System.out.println(p.age);
		System.out.println(p.money);
		System.out.println("==================");
		System.out.println(p2.name);
		System.out.println(p2.gender);
		System.out.println(p2.age);
		System.out.println(p2.money);
	}

}




