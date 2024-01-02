package october_03;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsBetweenArrays {
	public static void main(String[] args) {
		String[] array1 = { "apple", "banana", "cherry", "date" };
		String[] array2 = { "banana", "date", "grape", "kiwi" };

		// Create sets to store unique elements from each array
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();

		// Add elements from array1 to set1
		for (String element : array1) {
			set1.add(element);
		}

		// Add elements from array2 to set2
		for (String element : array2) {
			set2.add(element);
		}

		// Find the common elements by taking the intersection of the sets
		set1.retainAll(set2);

		// Print the common elements
		System.out.println("Common elements between the two arrays:");
		for (String commonElement : set1) {
			System.out.println(commonElement);
		}
	}
}
