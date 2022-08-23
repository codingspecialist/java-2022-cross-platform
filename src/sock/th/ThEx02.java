package sock.th;

interface Game2 {
	void start( );
}

class Hellofjdsalkfjdksaejkl implements Game2{

	@Override
	public void start() {
		System.out.println("게임 시작");
	}
	
}

public class ThEx02 {
	
	public void run(Game2 game) {
		game.start();
	}

	public static void main(String[] args) {
		ThEx02 th = new ThEx02();
		th.run(new Hellofjdsalkfjdksaejkl());
	}

}
