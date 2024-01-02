package dec_15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestNumberInArray {

	static void secondlargest() {
		
		List<Integer> l = Arrays.asList(1,4,8,9,6,2);
//		int max = l.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
		//System.out.println("Maximum number : "+max);
		//another method to find second largest element
		
		l.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
		
	}
	public static void main(String[] args) {
		secondlargest();
	}
}
