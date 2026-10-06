package matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static List<Integer> spiralOrder(int[][] arr){
		List<Integer> result = new ArrayList<>();
		int top = 0 ;
		int bottom = arr.length - 1;
		int left = 0;
		int right = arr[0].length-1;
		
		
		while (top<= bottom && left<=right) {
			 
			// left to right on top row
			for(int i = left ; i<= right ; i++) {
				result.add(arr[top][i]);
			}
			
			top++;
			
			//2 . top --> bottom on right column
			for(int i = top ; i<= bottom ; i++) {
				result.add(arr[i][right]);
			}
			right--;
			
			//right to left on bottom row
			if(top <= bottom) {
				for (int i = right ; i >= left ; i--) {
					result.add(arr[bottom][i]);
				}
				bottom--;
			}
			
			//bottom -> top on left column
			if(top <= bottom) {
				for (int i = bottom ; i>= top ; i--) {
					result.add(arr[i][left]);
				}
				left++;
			}
			
		}
		
		return result;
	}
	
	public static void main(String args[]) {
		
		int[][]  arr = {
				
			{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
		List<Integer> result = SpiralMatrix.spiralOrder(arr) ;
		System.out.println(result);
		
	}

}
