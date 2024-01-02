package dec_26;

public class CommandLineArgumentsArePassedDirectlyToTheMainMethod {

	public static void main(String[] nums) {
		if(nums.length>0) {
			System.out.println("Command line argument :");
			for(String num : nums) {
				System.out.println(num);
			}
		}
	}
}
