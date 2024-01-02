package dec_22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergeTwoListsWithoutDuplicates {

	static void mergeTwoListsWithoutDuplicates() {
		List<Integer> l = new ArrayList<>(List.of(4, 5, 6, 2, 3, 9));
		List<Integer> l1 = new ArrayList<>(List.of(1, 7, 8, 5, 3, 2));

		Set<Integer> mergeList = new HashSet<>(l);
		mergeList.addAll(l1);
		List<Integer> mergedWithoutDuplicates = new ArrayList<>(mergeList);
		System.out.println("MergeTwoListsWithoutDuplicates : "+ mergedWithoutDuplicates);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mergeTwoListsWithoutDuplicates();
	}

}
