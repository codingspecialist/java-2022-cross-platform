package ex07;

class Car { // 설계도 (오브젝트)
	String color;
	int speed;
	int gear;
}

public class CarTest {

	public static void main(String[] args) {
		Car c =  new Car(); // 인스턴스가 되었다. (오브젝트)
		c.color = "red";
		c.speed = 0;
		c.gear = 1;
		
		System.out.println(c.color);
		System.out.println(c.speed);
		System.out.println(c.gear);
		
		c.gear++;
		
		System.out.println(c.gear);
	}

}



