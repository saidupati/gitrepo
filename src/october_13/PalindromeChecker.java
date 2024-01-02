package october_13;

public class PalindromeChecker {
	public static void main(String[] args) {
		String str = "madam";
		str = str.toLowerCase();
		str = str.replaceAll("[^a-z0-9]", ""); // Remove non-alphanumeric characters

		int left = 0;
		int right = str.length() - 1;
		boolean isPalindrome = true;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				isPalindrome = false;
				break;
			}
			left++;
			right--;
		}

		if (isPalindrome) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");
		}
	}
}
