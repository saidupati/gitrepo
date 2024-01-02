package october_06;

import java.util.Arrays;

public class RemoveElementFromArray {
	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 4, 1, 4, 6 };
		int elementToRemove = 4;

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != elementToRemove) {
				arr[count++] = arr[i];
			}
		}

		int[] result = Arrays.copyOf(arr, count);

		System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(result));
	}
}
