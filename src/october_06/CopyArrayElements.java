package october_06;

import java.util.Arrays;

public class CopyArrayElements {
	public static void main(String[] args) {
		int[] sourceArray = { 1, 2, 3, 4, 5 };
		int[] destinationArray = new int[sourceArray.length];

		for (int i = 0; i < sourceArray.length; i++) {
			destinationArray[i] = sourceArray[i];
		}

		System.out.println("Source Array: " + Arrays.toString(sourceArray));
		System.out.println("Destination Array: " + Arrays.toString(destinationArray));
	}
}
