package assignment22;
import java.util.*;

public class CheckIfSparseMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows of the matrix:: ");
		
		int row = scan.nextInt();
		
		System.out.println("Enter the number of columns of the matrix:: ");
		int cols = scan.nextInt();
		
		int[][] mat = new int[row][cols];
		System.out.println("Enter the matrix:: ");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<cols;j++) {
				mat[i][j]= scan.nextInt();
			}
		}
		int count=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<cols;j++) {
				if(mat[i][j]==0) {
					count++;
				}
			}
			
			}
		if(count>((row*cols)/2)) {
			System.out.println("its a sparse matrix");
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

	}

}
