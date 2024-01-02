package october_12;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
	public static void main(String[] args) {
		String input = "abc";
		List<String> permutations = generatePermutations(input);
		for (String permutation : permutations) {
			System.out.println(permutation);
		}
	}

	public static List<String> generatePermutations(String str) {
		List<String> permutations = new ArrayList<>();
		permute("", str, permutations);
		return permutations;
	}

	private static void permute(String prefix, String remaining, List<String> permutations) {
		int n = remaining.length();
		if (n == 0) {
			permutations.add(prefix);
		} else {
			for (int i = 0; i < n; i++) {
				permute(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1, n),
						permutations);
			}
		}
	}
}
