package dec_15;

import java.util.Scanner;

public class FindArmStrongNumberOrNot {

	static void armstrongNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0,r = 0;
		while (num > 0) {
			r= num%10;
			num = num/10;
			sum = sum+r*r*r;
		}
		if(temp==sum) {
			System.out.println("its armstrong number");
		}
		else {
			System.out.println("its not armstrong number");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		armstrongNumber();
	}

}
