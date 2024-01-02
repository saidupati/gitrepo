package dec_18;

public class LongestSubStringWithoutRepeatingCharacter {

	static int longestSubString(String str) {
		
		int charIndex[] = new int[128];
		int maxLength = 0;
		int start = 0;
		for(int i =0;i<str.length();i++) {
			char c = str.charAt(i);
			start = Math.max(start , charIndex[c] );
			charIndex[c] = i + 1;
			maxLength = Math.max(maxLength, i-start+1);
		}
		return maxLength;
	}
	
	public static void main(String[] args) {
		String str = "saiprasanna";
		int result = longestSubString(str);
		System.out.println(result);
	}
}
