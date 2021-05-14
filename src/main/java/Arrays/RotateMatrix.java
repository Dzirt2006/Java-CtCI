package Arrays;

import org.testng.annotations.Test;

public class RotateMatrix {

	// 90% roatte
	public char[][] rotateMatrix(char[][] arr) {
		char[][] rotatedCopy = new char[arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			int indexX = arr.length - 1 - i;
			for (int j = 0; j < arr[i].length; j++) {
				int indexY = j;
				rotatedCopy[indexY][indexX] = arr[i][j];
			}
		}
		return rotatedCopy;
	}

	@Test
	public void f() {
		char[][] arr = { { 'a', 'b', 'c', '1' }, { 'd', 'e', 'f', '2' }, { 'g', 'h', 'i', '3' },
				{ 'j', 'k', 'l', '4' } };
		char[][] result = rotateMatrix(arr);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println("");
		}
	}
}
