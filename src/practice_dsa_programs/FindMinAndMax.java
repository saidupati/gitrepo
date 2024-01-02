package practice_dsa_programs;

public class FindMinAndMax {

	static void findMinAndMax() {
		int arr[] = {3,4,2,1,7,6};
		int min = arr[0];
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
			
		}
		System.out.println("minimum value is : "+min);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				
				max = arr[i];
			}
		}
		System.out.println("maximum value is : "+max);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     findMinAndMax();
	}

}
