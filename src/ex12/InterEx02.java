package ex12;

interface Callable {
	void 음식해();
}

class 라면 implements Callable{
	void 냄비물담기() {}
	void 가스에냄비올리기() {}
	void 불켜기() {}
	void 스프면넣기() {}
	@Override
	public void 음식해() {
		냄비물담기();
		가스에냄비올리기();
		불켜기();
		스프면넣기();
		System.out.println("라면이 완성되었습니다");
	}
}

class 김치찌게 implements Callable{
	void 냄비물담기() {}
	void 가스에냄비올리기() {}
	void 불켜기() {}
	void 김치추가() {}
	void 두부추가() {}
	@Override
	public void 음식해() {
		냄비물담기();
		가스에냄비올리기();
		불켜기();
		김치추가();
		두부추가();
		System.out.println("김치찌게가 완성되었습니다.");
	}
}


public class InterEx02 {

	public static void main(String[] args) {
		Callable c1 = new 라면();
		Callable c2 = new 김치찌게();
		
		c1.음식해();
		c2.음식해();
	}

}
