package ex09;

class 햄버거 {
	int price;
	String name;
	
	public 햄버거() {
		this(1000, "기본햄버거");
	}
	
	public 햄버거(int price, String name) {
		this.price = price;
		this.name = name;
	}
	
}

public class ConEx01 {
	public static void main(String[] args) {
		햄버거 s = new 햄버거(3000, "치즈햄버거");
	}

}
