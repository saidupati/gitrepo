package october_05;

import java.util.ArrayList;
import java.util.List;

public class FirstLastElementsArrayList {
	public static void main(String[] args) {
		List<Integer> aList = new ArrayList<>();
		aList.add(10);
		aList.add(30);
		aList.add(20);
		aList.add(14);
		aList.add(2);

		if (!aList.isEmpty()) {
			int first = aList.get(0);
			int last = aList.get(aList.size() - 1);
			System.out.println("First = " + first + ", Last = " + last);
		} else {
			System.out.println("ArrayList is empty.");
		}
	}
}
