package october_03;

import java.util.ArrayList;
import java.util.List;

public class SeparateEvenOdd {
	public static void main(String[] args) {
		int[] numbers = { 12, 3, 7, 15, 8, 9, 10, 6 };

		// Separate even and odd numbers
		List<Integer> evenNumbers = new ArrayList<>();
		List<Integer> oddNumbers = new ArrayList<>();

		for (int num : numbers) {
			if (num % 2 == 0) {
				evenNumbers.add(num);
			} else {
				oddNumbers.add(num);
			}
		}

		// Combine even and odd numbers
		List<Integer> result = new ArrayList<>();
		result.addAll(evenNumbers);
		result.addAll(oddNumbers);

		// Print the separated numbers
		System.out.println("Even numbers: " + evenNumbers);
		System.out.println("Odd numbers: " + oddNumbers);
		System.out.println("Separated array: " + result);
	}
}
