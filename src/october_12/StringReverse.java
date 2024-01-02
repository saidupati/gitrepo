package october_12;

public class StringReverse {
	public static void main(String[] args) {
		String input = "Hello, World!";
		String reversed = new StringBuilder(input).reverse().toString();
		System.out.println("Reversed String: " + reversed);
	}
}
