package dec_15;

import java.util.Arrays;

public class SwapTwoArrays {

	static void swapTwoArrays() {
		int arr1[] = {5,7,8,2,4};
		int arr2[]= {6,7,2,3,4};
				int[] temp = arr1;
				arr1 = arr2;
				arr2 = temp;
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
swapTwoArrays();
	}

}
