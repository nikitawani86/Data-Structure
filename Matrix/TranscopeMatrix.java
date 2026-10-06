package matrix;

import java.util.Arrays;

public class TranscopeMatrix {
	
	public int[][] TransposeMatrix(int[][] arr){
		int n = arr.length;
		int m = arr[0].length;
		int[][] result = new int[n][m];
	
		for (int i = 0; i < arr.length ;i++) {
			for(int j =0; j< arr.length ; j++) {
				result[j][i] = arr[i][j];
			}
		}
		
		return result;
	}
	
	public static void main(String args[]) {
		TranscopeMatrix  obj = new TranscopeMatrix();
		int[][] arr  = {
				
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		if(arr == null || arr.length == 0 || arr[0].length == 0) {
			return;
		}
		System.out.println(Arrays.deepToString(obj.TransposeMatrix(arr)));
		
		
		
	}
}
