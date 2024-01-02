package dec_22;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurenceElementsInList {

	
		static void countOccurence() {
			List<Integer> l = Arrays.asList(5,7,2,9,1,4,3,4,4,3,1);
			Map<Integer,Long> countOccurence = l.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
			countOccurence.forEach((Integer,Long)->System.out.println(Integer+ " "+Long));
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
countOccurence();
	}

}
