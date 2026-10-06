package matrix;

import java.util.Arrays;

public class Search2DMatrix {
	/*
	 * TC : O(m*n) and SC: O(1)
	 * Brute Force solution : Scanning each element of matrix
	public boolean searchInMatrix(int[][] matrix,int target){
		int m = matrix.length;
		int n = matrix[0].length;
		
		for(int i = 0;i<m;i++) {
			for(int j = 0; j<n;j++) {
				if(matrix[i][j] == target) {
					return true;
				}
			}
		}
		
		return false;
	}
	*/
	
	public boolean searchInMatrix(int[][] matrix ,int target) {
		
		int m = matrix.length;
		int n = matrix[0].length;
		
			
//			//first value of row i
//			int firstValue = matrix[i][0];
//			int lastValue = matrix[i][n-1];
			
			//Skip the rows now
			int low = 0 , high = m-1;
			while(low <= high) {
			
			int mid = low +( high-low) /2;
			if (target >= matrix[mid][0] &&  target <= matrix[mid][n-1]) {
				int l = 0 , r= n-1;
				while(l <= r) {
					int midcol = l + (r-l)/2;
					if(matrix[mid][midcol] == target) {
						return true;
					}else if (target > matrix[mid][midcol]) {
						low = midcol+1;
					}else {
						high = mid-1;
					}
				}
				return false;
			}else if(target > matrix[mid][n-1]){
				low = mid+1;
			}else {
				high = mid-1;
			}
			}
			
			
			/*
			 * Shorter Version of above code
			 * 
			 * int low = 0 , high = m-1;
			 * while(low<=high){
			 * 
			 * int mid = low+(high - low)/2
			 * int val = matrix[mid/n][mid%n]
			 * if(val == target) return true;
			 * else if (val < target) low = mid+1
			 * else high = mid-1
			 * 
			 * }
			 * return false
			 * 
			 * 
			 * 
			 * */
//			if(target >= firstValue && target <= lastValue) {
//				
//				//Search  inside the  row 
//				
//				for (int j = 0 ;j<n;j++) {
//					if(matrix[i][j] == target) {
//						return true;
//					}
//				}
//				return false;
//			}
			
			
		
		return false;
		
		
		
		
	}
	
	public static void main(String args[]) {
		int matrix[][] = {
				{1,3,5,7},
				{10,11,16,20},
				{23,30,34,60}
				
		};
		
		Search2DMatrix obj = new Search2DMatrix();
		 boolean result = obj.searchInMatrix(matrix, 20);
		 System.out.println(result);
	
	}
}
