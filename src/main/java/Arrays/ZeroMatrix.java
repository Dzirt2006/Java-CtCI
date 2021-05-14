package Arrays;

import org.testng.annotations.Test;


public class ZeroMatrix {
	
	// turn to 0 whole row and column in the matrix if 0 value present
	private int[][] zeroMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 0) {
					changer(arr, j, i);
					break;
				}

			}
		}
		return arr;
	}

	private void changer(int[][] arr, int xAxis, int yAxis) {
		// row to 0
		for (int i = 0; i < arr[yAxis].length; i++) {
			arr[yAxis][i] = 0;
		}
		// column to 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i][xAxis] = 0;
		}
	}

	@Test
	public void f() {
		int[][] arr = { { 1, 2, 3, 4, 4 }, { 5, 6, 7, 0, 8 }, { 9, 1, 2, 3, 3 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}

		zeroMatrix(arr);
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
	}
}