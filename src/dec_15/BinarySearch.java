package dec_15;

public class BinarySearch {

	static int binarySearch(int arr[], int target) {
		int left = 0;
		int right = arr.length-1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (arr[mid] < target) {
				left = mid + 1;
			} else { 
				right = mid - 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = { 4, 8, 1, 9, 2, 5 };
		int target = 5;
		int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not present in the array");
        } else {
            System.out.println("Element found at index " + result);
        }
	}
}
