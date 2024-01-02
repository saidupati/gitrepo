package october_06;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElementsInArrays {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 3, 4, 5, 6, 7 };

		Set<Integer> set1 = new HashSet<>();
		Set<Integer> commonElements = new HashSet<>();

		for (int num : arr1) {
			set1.add(num);
		}

		for (int num : arr2) {
			if (set1.contains(num)) {
				commonElements.add(num);
			}
		}

		int[] result = new int[commonElements.size()];
		int index = 0;
		for (int num : commonElements) {
			result[index++] = num;
		}

		System.out.println("Common elements: " + Arrays.toString(result));
	}
}
