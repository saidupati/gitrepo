package october_05;

import java.util.Scanner;

public class GCDHCF {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = scanner.nextInt();

		int gcd = findGCD(num1, num2);
		System.out.println("GCD (HCF) of " + num1 + " and " + num2 + " is: " + gcd);
	}

	public static int findGCD(int a, int b) {
		if (b == 0) {
			return a;
		}
		return findGCD(b, a % b);
	}
}
