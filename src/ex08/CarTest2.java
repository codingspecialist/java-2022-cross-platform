package ex08;

class Car2 {
	private String color; // 색상
	private int speed; // 속도
	private int gear; // 기어
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}

	void print() {
		System.out.println("color : "+color);
		System.out.println("speed : "+speed);
		System.out.println("gear : "+gear);
	}
}

public class CarTest2 {

	public static void main(String[] args) {
		Car2 myCar = new Car2();
		
		myCar.setColor("red");
		myCar.setSpeed(100);
		myCar.setGear(1);
		
		myCar.print();
		
		System.out.println();
		
//		System.out.println("현재 자동차의 색상은 "+myCar.getColor());
//		System.out.println("현재 자동차의 속도는 "+myCar.getSpeed());
//		System.out.println("현재 자동차의 기어는 "+myCar.getGear());
	}

}







