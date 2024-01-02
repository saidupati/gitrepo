package october_04;

import java.util.Arrays;

public class SeparateEvenOdd {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 9, 1, 5, 6 };
		int[] result = new int[arr.length];

		int evenIndex = 0;
		int oddIndex = arr.length - 1;

		for (int num : arr) {
			if (num % 2 == 0) {
				result[evenIndex++] = num;
			} else {
				result[oddIndex--] = num;
			}
		}

		System.out.println(Arrays.toString(result));
	}
}
