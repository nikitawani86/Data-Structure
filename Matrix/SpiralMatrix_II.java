package matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix_II {

	public int[][] spiralMatrix(int n) {
		int[][] result = new int[n][n];
		int top = 0, bottom = n - 1;
		int left = 0, right = n - 1;
		int num = 1;

		while (top <= bottom && left <= right) {
			// 1/ left to right on top rows
			for (int i = left; i <= right; i++) {

				result[top][i] = num++;

			}
			top++;

			// 2. top to bottom on right columns
			for (int i = top; i <= bottom; i++) {
				result[i][right] = num++;
			}
			right--;

			// 3. right to left on bottom row
			if (top <= bottom) {
				for (int i = right; i >= left; i--) {
					result[bottom][i] = num++;
				}
			}
			bottom--;

			// 4.bottom to top on left column
			if (left <= right) {
				for (int i = bottom; i >= top; i--) {
					result[i][left] = num++;
				}

			}
			left++;
		}
		return result;
	}

	public static void main(String args[]) {
		SpiralMatrix_II obj = new SpiralMatrix_II();
		int n = 3;

		int arr[][] = obj.spiralMatrix(n);
		System.out.println(Arrays.deepToString(arr));

	}

}
