package InterviewQuestions;

public class Question_4 {
	 public static void main(String[] args) {
	        int[] numbers={1,2,3,4,5};
	        numbers[1]=(numbers[2*1]==2-args.length)?numbers[3]:99;
	        System.out.println(numbers[1]);
	        
	    }
}
