package ex22;

import java.util.ArrayList;

public class GenericEx02 {

	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<>();
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		
		System.out.println(arr1.get(0));
		System.out.println(arr1.get(1));
		System.out.println(arr1.get(2));
		
		ArrayList<String> arr2 = new ArrayList<>();
		arr2.add("가");
		arr2.add("나");
		arr2.add("다");
		
		for (int i = 0; i < arr2.size(); i++) {
			System.out.println(arr2.get(i));			
		}
	}

}
