package dec_15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EvenAndOdd {

	static void evenAndOdd() {
		int arr[] = { 3, 6, 1, 9, 2, 4, 5, 8 };
		List<Integer> even = Arrays.stream(arr).filter(i -> i % 2 == 0).boxed().collect(Collectors.toList());
	List<Integer> odd = Arrays.stream(arr).filter(i->i%2!=0).boxed().collect(Collectors.toList());
		System.out.println("Even numbers : "+even);
		System.out.println("odd numbers : "+odd);
	}
	public static void main(String[] args) {
		evenAndOdd();
	}
}
