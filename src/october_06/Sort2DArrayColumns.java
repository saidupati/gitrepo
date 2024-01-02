package october_06;

import java.util.Arrays;

public class Sort2DArrayColumns {
	public static void main(String[] args) {
		int[][] matrix = { { 3, 2, 1 }, { 6, 5, 4 }, { 9, 8, 7 } };

		for (int col = 0; col < matrix[0].length; col++) {
			int[] columnData = new int[matrix.length];
			for (int row = 0; row < matrix.length; row++) {
				columnData[row] = matrix[row][col];
			}
			Arrays.sort(columnData);

			for (int row = 0; row < matrix.length; row++) {
				matrix[row][col] = columnData[row];
			}
		}

		System.out.println("Sorted 2D Array:");
		for (int[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
	}
}
