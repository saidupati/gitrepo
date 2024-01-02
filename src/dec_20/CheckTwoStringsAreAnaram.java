package dec_20;

import java.util.Arrays;

public class CheckTwoStringsAreAnaram {

	static boolean stringAnagram(String str, String str1) {

		str = str.replaceAll("\\s", "").toLowerCase();
		str1 = str1.replaceAll("\\s", "").toLowerCase();

		if (str.length() != str1.length()) {
			return false;
		} else {
			char[] charArray1 = str.toCharArray();
			char[] charArray2 = str1.toCharArray();

			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			return Arrays.equals(charArray1, charArray2);
		}

	}

	public static void main(String[] args) {
		String str = "qwerat";
		String str1 = "treawq";
		if (stringAnagram(str, str1)) {
       System.out.println("string is anagram");
		}else {
			System.out.println("String is not anagram");
		}
	}

}
