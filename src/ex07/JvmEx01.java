package ex07;

class Person {
	static String name = "엘리스";
	
	int 목마름 = 100; // 0~100

	void 물마시기() {
		
		this.목마름 = this.목마름 - 10;
	}

	void 달리기(int speed) {
		if (speed < 10) {
			목마름 = 목마름 + 10;
		} else if (speed < 20) {
			목마름 = 목마름 + 20;
		} else {
			목마름 = 목마름 + 30;
		}
	}
}

public class JvmEx01 {
	
	static String name = "JvmEx01";

	public static void main(String[] args) {
		System.out.println(JvmEx01.name);
		System.out.println(Person.name);
		Person p = new Person();
		p.물마시기();
		p.물마시기();
		p.물마시기();
		System.out.println(p.목마름);
		p.달리기(10);
		System.out.println(p.목마름);
	}

}
