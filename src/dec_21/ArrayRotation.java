package dec_21;

import java.util.Arrays;

public class ArrayRotation {

	public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return;
        }

        int n = nums.length;
        k %= n;

        reverse(nums, 0, n - 1); 
        reverse(nums, 0, k - 1); 
        reverse(nums, k, n - 1); 
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 6;

        System.out.println("Original Array: " + Arrays.toString(arr));
        rotate(arr, k);
        System.out.println("Rotated Array by " + k + " steps: " + Arrays.toString(arr));
    }
}
