import java.util.*;
//import java.io.*;

class Twelve {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int[][] matrix = new int[rows][rows];
		int x = 0; // hang
		int y = 0;// lie
		while (x < rows + 1) {
			if (y == 0 || y == x) {
				matrix[x][y] = 1;
			}
			else if(y == x){
				matrix[x][y] = 1;
			}
				else{
				while (y < x -1) {
					matrix[x][y] = matrix[x-1][y] + matrix[x-1][y - 1];
				}
			}

		}
	}
}