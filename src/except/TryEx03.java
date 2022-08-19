package except;

public class TryEx03 {
	
	public static void 나누기(int n1, int n2) {
		try {
			System.out.println(n1/n2);
		} catch (Exception e) {
			System.out.println("0을 숫자로 나눌수 없어요. : "+n1);
		}
	}
	
	public static void 순회하기(int n[]) {
		try {
			for(int i=0; i<3; i++) {
				System.out.println(n[i]);
			}
		} catch (Exception e) {
			System.out.println("제발 배열 3개 크기로 넣어줘");
		}

	}
	
	public static void main(String[] args) {
		나누기(5,0);
		int[] n = {1,2};
		순회하기(n);
	}
}



