package dec_18;

public class ValidParentheses {

    static int validParentheses(String s) {
        int parenthesesCount = 0;
        int curlyBracesCount = 0;
        int squareBracketsCount = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                parenthesesCount++;
            } else if (c == '{') {
                curlyBracesCount++;
            } else if (c == '[') {
                squareBracketsCount++;
            } else if (c == ')') {
                parenthesesCount--;
            } else if (c == '}') {
                curlyBracesCount--;
            } else if (c == ']') {
                squareBracketsCount--;
            }

            if (parenthesesCount < 0 || curlyBracesCount < 0 || squareBracketsCount < 0) {
                return 0;
            }
        }

        return (parenthesesCount == 0 && curlyBracesCount == 0 && squareBracketsCount == 0) ? 1 : 0;
    }

    public static void main(String[] args) {
        String inputString = "{[()}";
        int result = validParentheses(inputString);
        if (result == 1) {
            System.out.println("The string is valid.");
        } else {
            System.out.println("The string is not valid.");
        }
    }
}
