package october_03;

public class SwapArrays {
	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 6, 7, 8, 9, 10 };

		// Ensure both arrays have the same length
		if (array1.length != array2.length) {
			System.out.println("Arrays must have the same length to swap.");
			return;
		}

		// Swap the arrays using a temporary variable
		int temp;
		for (int i = 0; i < array1.length; i++) {
			temp = array1[i];
			array1[i] = array2[i];
			array2[i] = temp;
		}

		// Print the swapped arrays
		System.out.println("Array 1 after swapping:");
		for (int num : array1) {
			System.out.print(num + " ");
		}

		System.out.println("\nArray 2 after swapping:");
		for (int num : array2) {
			System.out.print(num + " ");
		}
	}
}
