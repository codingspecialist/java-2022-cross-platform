package ex08;

class Car {
	private String color; // 색상
	private int speed; // 속도
	private int gear; // 기어
	
	// getter
	String getColor() {
		return color;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	int getSpeed() {
		return speed;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	int getGear() {
		return gear;
	}
	
	void setGear(int gear) {
		this.gear = gear;
	}
}

public class CarTest1 {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setColor("red");
		myCar.setSpeed(100);
		myCar.setGear(1);
		
		System.out.println("현재 자동차의 색상은 "+myCar.getColor());
		System.out.println("현재 자동차의 속도는 "+myCar.getSpeed());
		System.out.println("현재 자동차의 기어는 "+myCar.getGear());
	}

}







