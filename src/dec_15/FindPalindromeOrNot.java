package dec_15;

import java.util.Scanner;

public class FindPalindromeOrNot {

	static void palindromeOrNot() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int org_num = num;
		int rev = 0;
		while(num>0) {
			rev = rev*10+num%10;
			num = num/10;
		}
		if(org_num==rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("its not palindrome");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
palindromeOrNot();
	}

}
