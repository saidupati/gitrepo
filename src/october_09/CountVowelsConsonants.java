package october_09;

public class CountVowelsConsonants {
	public static void countVowelsAndConsonants(String input) {
		int vowels = 0;
		int consonants = 0;
		input = input.toLowerCase(); // Convert the input to lowercase for case insensitivity
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}
		}
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
	}

	public static void main(String[] args) {
		String input = "Hello World";
		countVowelsAndConsonants(input);
	}
}
