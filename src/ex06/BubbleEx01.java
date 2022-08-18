package ex06;

public class BubbleEx01 {

	public static void main(String[] args) {
		int[] arr = { 40, 30, 10, 8, 5 };

		// 첫번째 사이클
		if (arr[0] > arr[1]) {
			int temp;
			temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}

		if (arr[1] > arr[2]) {
			int temp;
			temp = arr[1];
			arr[1] = arr[2];
			arr[2] = temp;
		}

		if (arr[2] > arr[3]) {
			int temp;
			temp = arr[2];
			arr[2] = arr[3];
			arr[3] = temp;
		}

		if (arr[3] > arr[4]) {
			int temp;
			temp = arr[3];
			arr[3] = arr[4];
			arr[4] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("첫번째 사이클 종료====");

		// 두번째 사이클
		if (arr[0] > arr[1]) {
			int temp;
			temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}

		if (arr[1] > arr[2]) {
			int temp;
			temp = arr[1];
			arr[1] = arr[2];
			arr[2] = temp;
		}

		if (arr[2] > arr[3]) {
			int temp;
			temp = arr[2];
			arr[2] = arr[3];
			arr[3] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("두번째 사이클 종료====");

		// 세번째 사이클
		if (arr[0] > arr[1]) {
			int temp;
			temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}

		if (arr[1] > arr[2]) {
			int temp;
			temp = arr[1];
			arr[1] = arr[2];
			arr[2] = temp;
		}


		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("세번째 사이클 종료====");

		// 네번째 사이클
		if (arr[0] > arr[1]) {
			int temp;
			temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("네번째 사이클 종료====");
	}

}
