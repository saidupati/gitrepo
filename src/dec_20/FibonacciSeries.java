
package dec_20;

public class FibonacciSeries {

	static void fibonacciSeries() {
		int num = 0;
		int num1 = 1;
		int sum;
		System.out.print(num + " " + num1 + " ");
		for (int i = 2; i <5; i++) {
			sum = num + num1;
			System.out.print(sum +" ");
			num = num1;
			num1 = sum;
		}
	}

	public static void main(String[] args) {
		fibonacciSeries();
	}

}
