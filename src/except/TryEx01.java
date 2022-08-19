package except;

// 지구인은 아시아인과, 아프리카인, 한국인의 구현체가 있습니다.
abstract class 지구인{
	abstract String getName();
}
class 아시아인 extends 지구인{
	String getName() {
		return "아시아인";
	}
}
class 아프리카인 extends 지구인{
	String getName() {
		return "아프리카인";
	}
}
class 한국인 extends 아시아인{
	String getName() {
		return "한국인";
	}
}

interface SingleTicket {
	void start(지구인 s);
}

class 우주선 {
	protected void 화성으로(지구인 s) {
		////
		System.out.println("화성으로 "+s.getName()+"이 날라갑니다.");
	}
}

// 야 니가 우주선을 날리고 싶으면 SingleTicket을 구현해서 start를 호출해
// 대신 start 내부는 니가 구현해야 하는데 
// 우주선을 상속받아서 그 친구가 들고 있는 메서드(화성으로)에 s만 넣어주면 돼.

public class TryEx01 extends 우주선 implements SingleTicket{

	@Override
	public void start(지구인 s) {
		화성으로(s);
	}
	
	public static void main(String[] args) {
		지구인 s1 = new 아프리카인();
		
		TryEx01 t1 = new TryEx01();
		t1.start(s1);
	}




}
