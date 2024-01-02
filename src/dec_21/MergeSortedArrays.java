package dec_21;

import java.util.Arrays;

public class MergeSortedArrays {

	public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < n1) {
            merged[k++] = arr1[i++];
        }

        while (j < n2) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 1, 7, 5, 9};
        int[] arr2 = {4, 6, 2, 7, 8, 11};

        int[] merged = mergeSortedArrays(arr1, arr2);

        System.out.println("Merged Sorted Array:");
        Arrays.stream(merged).forEach(num -> System.out.print(num + " "));
    }

}
