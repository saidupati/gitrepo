package october_13;

public class MaxMinOccurringCharacter {
	public static void main(String[] args) {
		String str = "sai prasanna dupati";
		int[] charCount = new int[256];

		for (char c : str.toCharArray()) {
			charCount[c]++;
		}

		char maxChar = 0;
		char minChar = 0;

		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] > 0) {
				if (charCount[i] > charCount[maxChar]) {
					maxChar = (char) i;
				}
				if (charCount[i] < charCount[minChar] || minChar == 0) {
					minChar = (char) i;
				}
			}
		}

		System.out.println("Maximum occurring character: " + maxChar);
		System.out.println("Minimum occurring character: " + minChar);
	}
}
