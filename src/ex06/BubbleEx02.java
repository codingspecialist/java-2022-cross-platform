package ex06;

public class BubbleEx02 {

	public static void main(String[] args) {
		int[] arr = { 50, 40, 30, 10, 8, 5 };

		// 첫번째 사이클
		for(int i=0; i<5; i++) {
			if (arr[i] > arr[i+1]) {
				int temp;
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("첫번째 사이클 종료====");

		// 두번째 사이클
		for(int i=0; i<4; i++) {
			if (arr[i] > arr[i+1]) {
				int temp;
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("두번째 사이클 종료====");

		// 세번째 사이클
		for(int i=0; i<3; i++) {
			if (arr[i] > arr[i+1]) {
				int temp;
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("세번째 사이클 종료====");

		// 네번째 사이클
		for(int i=0; i<2; i++) {
			if (arr[i] > arr[i+1]) {
				int temp;
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("네번째 사이클 종료====");
		
		
		// 다섯번째 사이클
		for(int i=0; i<1; i++) {
			if (arr[i] > arr[i+1]) {
				int temp;
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("다섯번째 사이클 종료====");
	}

}
