package october_04;

public class SecondSmallest {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 9, 1, 5, 6 };

		int firstMin = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;

		for (int num : arr) {
			if (num < firstMin) {
				secondMin = firstMin;
				firstMin = num;
			} else if (num < secondMin && num != firstMin) {
				secondMin = num;
			}
		}

		System.out.println("Second smallest element: " + secondMin);
	}
}
