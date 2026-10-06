package matrix;

import java.util.Arrays;

public class RotateMatrix {
	
	/*
	 * For rotate Matrix : 1. Transpose Matrix 
	 * 2.Reverse each row
	 * 
	 * 
	 * */
	public void rotateMatrix(int[][] arr) {
		
		int m = arr.length;
		int n = arr[0].length;
		
		//Transpose matrix
		for (int i = 0 ;i<n;i++) {
			for (int j = i+1; j<m ;j++) {
				int temp = arr[i][j];
				arr[i][j]= arr[j][i];
				arr[j][i] = temp;
						
			
			}
		}
		
		//Reverse Each row : For clockwise rotation
		/*
		for (int i = 0;i<n ;i++) {
			int left = 0;
			int right = n-1;
			while (left <  right) {
				int temp = arr[i][left];
				arr[i][left] = arr[i][right];
				arr[i][right] = temp;
				
				left++;
				right--;
			}
		}
		*/
		//Reverse Each column for anti clockwise
		
		for (int j = 0 ; j< n; j++) {
			int top = 0 , bottom = n-1;
			while (top < bottom) {
				int temp = arr[top][j];
				arr[top][j] = arr[bottom][j];
			    arr[bottom][j] = temp;
			    
			    top++;
			    bottom--;
			}
		}
	}
	
	public static void main(String args[]) {
		RotateMatrix obj  = new RotateMatrix();
	int[][] arr  = {
				
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
	obj.rotateMatrix(arr);
		 System.out.println(Arrays.deepToString(arr));
	}

}
