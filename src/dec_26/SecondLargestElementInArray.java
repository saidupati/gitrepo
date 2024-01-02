package dec_26;

import java.util.Arrays;
import java.util.stream.Collectors;

import october_04.SecondLargest;

public class SecondLargestElementInArray {

	static void seondLargest() {
		int arr[] = { 5, 9, 3, 4, 1, 2, 8 };
		Arrays.stream(arr).sorted().skip(1).limit(1).forEach(l -> System.out.println(l));
	}

	public static void main(String[] args) { 
		seondLargest();
	}

}
