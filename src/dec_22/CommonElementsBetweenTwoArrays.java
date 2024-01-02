package dec_22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElementsBetweenTwoArrays {

	static void commonElements() {
		List<Integer> l = Arrays.asList(2,4,6,8,3,9);
		List<Integer> l1 = Arrays.asList(4,6,9,2,4,1);
		
		Set<Integer> set1 = new HashSet<>(l);
		Set<Integer> set2 = new HashSet<>(l1);
		
		set1.retainAll(set2);
		
		List<Integer> commomElements = new ArrayList<>(set1);
		System.out.println("Common Elements : "+commomElements);
		}
	public static void main(String[] args) {
		commonElements();
		
	}
}
