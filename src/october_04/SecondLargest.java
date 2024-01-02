package october_04;

public class SecondLargest {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 9, 1, 5, 6 };

		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > firstMax) {
				secondMax = firstMax;
				firstMax = num;
			} else if (num > secondMax && num != firstMax) {
				secondMax = num;
			}
		}

		System.out.println("Second largest element: " + secondMax);
	}
}
