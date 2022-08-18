package ex09;

abstract class Unit {
	abstract int getPower();
	
	abstract int getHp();
	
	abstract void setPower(int power) ;
	
	abstract void setHp(int hp);
}

class Zealot extends Unit{
	int power = 5;
	int hp = 100;
	
	int getPower() {
		return power;
	}
	
	int getHp() {
		return hp;
	}
	
	void setPower(int power) {
		this.power = power;
	}
	
	void setHp(int hp) {
		this.hp = hp;
	}
}

class Dragoon extends Unit{
	int power = 10;
	int hp = 100;
	
	int getPower() {
		return power;
	}
	
	int getHp() {
		return hp;
	}
	
	void setPower(int power) {
		this.power = power;
	}
	
	void setHp(int hp) {
		this.hp = hp;
	}
}

class River extends Unit{
	int power = 50;
	int hp = 100;
	
	int getPower() {
		return power;
	}
	
	int getHp() {
		return hp;
	}
	
	void setPower(int power) {
		this.power = power;
	}
	
	void setHp(int hp) {
		this.hp = hp;
	}
}

class DarkTempler extends Unit {
	int hp = 100;
	int power = 70;
	
	
	@Override
	int getPower() {
		// TODO Auto-generated method stub
		return power;
	}

	@Override
	int getHp() {
		// TODO Auto-generated method stub
		return hp;
	}

	@Override
	void setPower(int power) {
		this.power = power;
	}

	@Override
	void setHp(int hp) {
		this.hp = hp;
	}
	
}




public class OverEx03 {

	static void attack(Unit u1, Unit u2) {
		u2.setHp(u2.getHp() - u1.getPower());
		System.out.println("hp는 : " + u2.getHp());
	}


	public static void main(String[] args) {
		Zealot z1 = new Zealot();
		Dragoon d1 = new Dragoon();
		River r1 = new River();
		DarkTempler dd1 = new DarkTempler();

		attack(r1, dd1);
	}

}
