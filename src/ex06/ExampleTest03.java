package ex06;

public class ExampleTest03 {
	
	static double 표준체중계산(int height) {
		double standardWeight = (height-100) * 0.9; 
		return standardWeight;
	}
	
	static void 체중비교및출력(double standardWeight, double weight) {
		if(weight > standardWeight) {
			System.out.println("과제충");
		}else if(weight < standardWeight) {
			System.out.println("저체중");
		}else {
			System.out.println("표준");
		}
	}


	public static void main(String[] args) {
		int height = 150;
		double weight = 70;
		
		double standardWeight = 표준체중계산(height);
		체중비교및출력(standardWeight, weight);
	}

}



