package dec_26;

import java.util.Arrays;

public class BubbleSortAlgorithm {

	static void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 4, 8, 9, 2, 5, 1, 3 };
		bubbleSort(arr);
		System.out.println("Bubble sort : " + Arrays.toString(arr));
	}

}
