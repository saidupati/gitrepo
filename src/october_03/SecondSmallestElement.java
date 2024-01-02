package october_03;

public class SecondSmallestElement {
	public static void main(String[] args) {
		int[] numbers = { 12, 5, 8, 7, 3, 9, 11, 4, 6 };

		if (numbers.length < 2) {
			System.out.println("Array has less than 2 elements. Cannot find the second smallest.");
		} else {
			int smallest = Integer.MAX_VALUE;
			int secondSmallest = Integer.MAX_VALUE;

			for (int num : numbers) {
				if (num < smallest) {
					secondSmallest = smallest;
					smallest = num;
				} else if (num < secondSmallest && num != smallest) {
					secondSmallest = num;
				}
			}

			if (secondSmallest == Integer.MAX_VALUE) {
				System.out.println("There is no second smallest element.");
			} else {
				System.out.println("The second smallest element is: " + secondSmallest);
			}
		}
	}
}
