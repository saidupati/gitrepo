package dec_28;

import java.util.Arrays;

public class LinearSearch {

	static void linearSearch() {
		int arr[] = { 7, 2, 6, 1, 8, 5 };
		int target = 10;
		int temp = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				temp=i;
		}
		}
		if(temp!=-1) {
			System.out.println("Element found at index : " + temp);}
		else
		{
			System.out.println("Element not found in the array.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linearSearch();
	}

}
	
