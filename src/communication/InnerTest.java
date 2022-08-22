package communication;

import communication.A.B;

class A{
	
	int num1 = 10;
	
	public B getB() {
		return new B();
	}
	
	class B {
		int num2 = 20;
	}
}

public class InnerTest {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.num1);
		B b = a.getB();
	}

}
