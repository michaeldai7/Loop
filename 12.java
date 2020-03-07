import java.util.*;
//import java.io.*;

class Twelve {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please give an integer");
		int rows = sc.nextInt();
		int[][] matrix = new int[rows + 1][rows + 1];
		int j = 0;
		// int space = rows/2;
		int l = 0;
		for (int i = 0; i < rows; i++) {
			j = 0;
			if (j == 0) {
				matrix[i][j] = 1;
				j++;
			}
			if (j == i) {
				matrix[i][j] = 1;
			}
			while (j < i && i > 1 && j != 0 && j != i) {
				matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j];
				j++;
			}
			if (j == i) {
				matrix[i][j] = 1;
			}

		}
		for (int i = 0; i < rows; i++) {
			l = 0;
			while (l < rows - i) {
				System.out.print(" ");
				l++;
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(matrix[i][k] + " ");
			}
			System.out.println(" ");
		}
	}
}