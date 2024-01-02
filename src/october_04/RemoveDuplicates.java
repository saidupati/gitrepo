package october_04;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 4, 5 };

		Set<Integer> set = new LinkedHashSet<>();
		for (int num : arr) {
			set.add(num);
		}

		int[] result = new int[set.size()];
		int index = 0;
		for (int num : set) {
			result[index++] = num;
		}

		System.out.println(Arrays.toString(result));
	}
}
