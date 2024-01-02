package october_06;

import java.util.Arrays;

public class ArrayRotation {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int rotations = 2;

		int n = arr.length;
		int[] rotatedArray = new int[n];

		for (int i = 0; i < n; i++) {
			int newPosition = (i + rotations) % n;
			rotatedArray[newPosition] = arr[i];
		}

		System.out.println("Original Array: " + Arrays.toString(arr));
		System.out.println("Rotated Array: " + Arrays.toString(rotatedArray));
	}
}
