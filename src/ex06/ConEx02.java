package ex06;

public class ConEx02 {

	public static void main(String[] args) {
		int point = 91;
		
		if(point >= 90) {
			System.out.println("A학점");
		}
		
		if(point >= 80 && point < 90) {
			System.out.println("B학점");
		}
		
		if(point >= 70 && point < 80) {
			System.out.println("C학점");
		}
		
		if(point >= 60 && point < 70) {
			System.out.println("D학점");
		}
		
		if(point < 60) {
			System.out.println("F학점");
		}
		
	}

}
