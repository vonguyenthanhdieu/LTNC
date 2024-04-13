package Cau1;

public class Cau1 {
	public static int[][] maTran(int[] arr) {
		int[][] result = new int[arr.length][arr.length];
		int index = 0;
		for (int i= arr.length -1; i >= 0; i--) {
			result[index][i] = arr[i];
			if (i != arr.length -1 )
				for (int j=i+1; j< arr.length; j++ )
					result[index][j] = result[index][j-1] + 2;
			
			if (i != 0)
				for (int j=i-1; j >=0; j-- )
					result[index][j] = result[index][j+1] - 2;
			index++;
		}
		
		return result;
	}
	public static void printMatrix(int[][] matrix, int n) {
		for (int i= 0; i< n; i++) {
			for (int j=0; j< n; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[] a = {9, 5, 3, 10, 8, 20};
		maTran(a);
		printMatrix(maTran(a), a.length);
	}
}
