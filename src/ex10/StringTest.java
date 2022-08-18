package ex10;

public class StringTest {

	public static void main(String[] args) {
		String str = "name=홍길동";
		String s[] = str.split("=");
		System.out.println(s[0]);
		System.out.println(s[1]);
		String key = s[0];
		String value = s[1];
		
		String data = "<name>홍길동</name>";
		String h = "{ name : 홍길동, age: 10 }";
	}

}
