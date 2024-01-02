package dec_21;

import java.util.Arrays;

public class MissingNumberInArray {

	static int missingNumber() {
		int arr[] = { 1, 2, 3, 4, 6, 7, 8, 9 };
		int num = arr.length + 1;
		int totalSum = num * (num + 1) / 2;
		// normal way
//		int arraySum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			arraySum += arr[i];
//		}
		//in java8
		int arraySum = Arrays.stream(arr).sum();
		int missingNum = totalSum - arraySum;

		return missingNum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Missing num is : "+missingNumber());;
	}

}
