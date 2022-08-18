package ex09;

class Car {
	private String color;
	private int speed;
	private int gear;
	
	// 생성자
	public Car(String color, int speed, int gear) {
		System.out.println("Car 객체가 만들어졌습니다.");
		this.color = color;
		this.speed = speed;
		this.gear = gear;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
}

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car("red", 10, 2);
		System.out.println(car.toString());
	}

}
