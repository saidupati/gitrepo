package october_03;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayDescending {
	public static void main(String[] args) {
		Integer[] numbers = { 5, 2, 9, 1, 5, 6 };

		// Sort the array in ascending order
		Arrays.sort(numbers);

		// Reverse the sorted array to get descending order
		Collections.reverse(Arrays.asList(numbers));

		// Print the sorted array in descending order
		System.out.println("Sorted array in descending order:");
		for (int num : numbers) {
			System.out.print(num + " ");
		}
	}
}
