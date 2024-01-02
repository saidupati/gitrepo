package dec_18;

public class FullPyramid {

	static void fullPyramid() {
		int r = 5;
		for(int i=0;i<=r;i++) {
			for(int j=i;j<r;j++) {
				System.out.println(" ");
			}
			for(int k=1;k<=2*i-1;k++)
				System.out.println("*");
		}
		System.out.println();
		}
	public static void main(String[] args) {
		fullPyramid();
	}
}
