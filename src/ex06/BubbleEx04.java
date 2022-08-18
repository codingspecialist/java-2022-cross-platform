package ex06;

public class BubbleEx04 {

	public static void main(String[] args) {
		int[] arr = { 50, 40, 30, 10, 8, 5 };
		int n = 0;
		
		for(int k=arr.length-1; k>0; k--) {
			n++;
			for(int i=0; i<k; i++) {
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
			System.out.println(n+"번째 사이클 종료====");
		}
		
	
	}

}
