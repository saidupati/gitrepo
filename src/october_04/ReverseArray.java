package october_04;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int length = arr.length;

		for (int i = 0; i < length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[length - i - 1];
			arr[length - i - 1] = temp;
		}

		System.out.println(Arrays.toString(arr));
	}
}
