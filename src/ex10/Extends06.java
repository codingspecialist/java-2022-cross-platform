package ex10;

class 캐릭터{}


class 질럿 extends 캐릭터{
	String name = "질럿";
	int hp = 100;
	int power = 5;
}

class 드라군 extends 캐릭터{
	String name = "드라군";
	int hp = 100;
	int power = 10;
}

public class Extends06 {
	
	static void attack(캐릭터 u1, 캐릭터 u2) {
		드라군 d = null;
		질럿 z = null;
		
		if(u1 instanceof 드라군) {
			d = (드라군)u1;
		}
		
		if(u1 instanceof 질럿) {
			z = (질럿)u1;
		}
		
		if(u2 instanceof 드라군) {
			d = (드라군)u2;
		}
		if(u2 instanceof 질럿) {
			z = (질럿)u2;
		}
		
		if(u1 instanceof 질럿) {
			d.hp = d.hp - z.power;
			System.out.println(d.name+"의 남은 체력 : "+d.hp);
		}
		
		if(u1 instanceof 드라군) {
			z.hp = z.hp - d.power;
			System.out.println(z.name+"의 남은 체력 : "+z.hp);
		}
		
		

	}

	
	public static void main(String[] args) {
		드라군 d1 = new 드라군();
		질럿 z1 = new 질럿();
		
		// 드라군 질럿 공격
		attack(d1, z1);
		attack(z1, d1);
		
		
	}
}
