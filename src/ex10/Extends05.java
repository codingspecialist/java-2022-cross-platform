package ex10;

class 라면 {
	String getName() {return "";}
	int getPrice() {return 0;}
	void setPrice(int price) {}
}

class 삼양라면 extends 라면{
	String name = "삼양라면";
	int price = 1000;
}

class 신라면 extends 라면{
	String name = "신라면";
	int price = 1500;
}


public class Extends05 {
	
	static void print(라면 lamun) {
		System.out.println(lamun.getName());
		System.out.println(lamun.getPrice());
		lamun.setPrice(3000);
		System.out.println(lamun.getPrice());
	}

	public static void main(String[] args) {
		삼양라면 samyang = new 삼양라면();
		신라면 sin = new 신라면();
		
		print(samyang);
		print(sin);
	}

}
