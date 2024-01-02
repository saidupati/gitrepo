package dec_15;

import java.util.Arrays;

public class RemoveDuplicateElementsInArray {

	static void removeDuplicates() {
		int arr[] = {4,3,7,6,1,4};
		Arrays.stream(arr).distinct().forEach(System.out::println);
	}
	public static void main(String[] args) {
		removeDuplicates();
	}

}
