package dec_20;

public class FindDuplicatesElements {

	static void duplicateElements() {
		int arr[] = { 5, 7, 2, 3, 4, 2, 9, 1, 3 };
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] ) {

					count++;
					arr[j]=0;
				}
			}
			if( count<=1 && arr[i]!=0) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicateElements();
	}

}
