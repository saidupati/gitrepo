package dec_18;

public class ReverseWord {

	static String reverseWord() {
		String str = "hi sai prasanna dupati";

		String[] words = str.split("\\s+");
		StringBuilder rev = new StringBuilder();

		for (int i = words.length - 1; i >= 0; i--) {
        rev.append(words[i]).append(" ");
		}
		return rev.toString().trim();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(reverseWord());;
	}

}
