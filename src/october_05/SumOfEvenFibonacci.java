package october_05;

import java.util.Scanner;

public class SumOfEvenFibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value of N: ");
		int n = scanner.nextInt();

		int sum = 0;
		int a = 0;
		int b = 1;

		for (int i = 1; i <= n; i++) {
			int fib = a + b;
			if (i % 2 == 0) {
				sum += fib;
			}
			a = b;
			b = fib;
		}

		System.out.println("Sum of first " + n + " even Fibonacci numbers is: " + sum);
	}
}
