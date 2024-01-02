package practice_java8_programs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalInt;

public class FindMaxAndMin {

	static void findMaxAndMin() {
		int arr[] = { 3, 4, 5, 2, 1, 9 };
		int max = Arrays.stream(arr).max().orElseThrow();
		System.out.println("Maximum value : "+max);
		
		int min = Arrays.stream(arr).min().orElseThrow();
		System.out.println("Minimum value : "+min);
				
	}
	public static void main(String[] args) {
		findMaxAndMin();
	}
}
