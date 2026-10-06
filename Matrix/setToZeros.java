package matrix;

import java.util.Arrays;

public class  setToZeros {

	public int[][] setToZero(int[][] input) {
		int m = input.length;
		int n = input[0].length;

		int[][] result = new int[n][m];
		int row = 0, column=0;
		//Finding the zero element
		for (int i = 0; i < m; i++) {

			for (int j = 0; j < n; j++) {
				if(input[i][j] == 0) {
				row = i;
				column = j;
			}

		}
		}
		
		
		//Setting the zeroszz
		for(int i = 0 ; i < m ;i++) {
			for (int j = 0; j< n; j++) {
				if(i == row || j == column) {
					result[i][j] = 0;
				}else {
					result[i][j] = input[i][j];
				}
			}
		}
	return result;
		

	}
	
	public static void main(String args[]) {
		int[][] input = {
				
				{1,1,1},
				{1,0,1},
				{1,1,1}
		};
		setToZeros obj = new setToZeros();
	
		int[][] result =  obj.setToZero(input);
		
		System.out.println(Arrays.deepToString(result));
		
		
		
	}
	
	

}
