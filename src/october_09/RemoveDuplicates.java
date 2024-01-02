package october_09;

public class RemoveDuplicates {
	public static String removeDuplicates(String input) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			if (result.indexOf(String.valueOf(currentChar)) == -1) {
				result.append(currentChar);
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		String input = "programming";
		String result = removeDuplicates(input);
		System.out.println(result);
	}
}
