package dec_15;

public class FindPrimeNumbersBetween1to100 {

	static void primeNumbers() {
		for (int i = 2; i < 100; i++) {
			int count = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0 && i != 1) {
				System.out.println(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		primeNumbers();
	}

}
