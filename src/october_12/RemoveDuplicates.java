package october_12;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String input = "programming";
		String result = removeDuplicates(input);
		System.out.println("String with duplicates removed: " + result);
	}

	public static String removeDuplicates(String str) {
		Map<Character, Boolean> map = new HashMap<>();
		StringBuilder result = new StringBuilder();

		for (char c : str.toCharArray()) {
			if (!map.containsKey(c)) {
				map.put(c, true);
				result.append(c);
			}
		}

		return result.toString();
	}
}
