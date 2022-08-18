package ex10;

class 지구인 {
	int armCount = 2;
	int legCount = 2;
}

class 아시아인 extends 지구인 {
	String hairColor = "검정";
}

class 한국인 extends 아시아인{
	String faceColor = "황토";
}

public class Extends01 {

	public static void main(String[] args) {
		
		
		한국인 h1 = new 한국인(); // 한국인, 아시아인, 지구인
		System.out.println(h1.faceColor);
		System.out.println(h1.hairColor);
		System.out.println(h1.legCount);
		System.out.println(h1.armCount);
		
		한국인 h2 = h1;
		아시아인 a1 = h2; // ????????
		
		지구인 han1 = new 한국인();
		
		지구인 han2 = new 아시아인();
		
		//아시아인 han3 = new 지구인();
	}

}
