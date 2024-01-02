package october_13;

public class CountWords {
	public static void main(String[] args) {
		String str = "Sai prasanna Dupai sai";
		String[] words = str.split("\\s+"); 
		int wordCount = words.length;
		System.out.println("Total number of words: " + wordCount);
	}
}
