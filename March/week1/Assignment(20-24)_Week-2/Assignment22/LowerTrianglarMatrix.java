package assignment22;
import java.util.*;

public class LowerTrianglarMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the matrix:: ");
		int size = scan.nextInt();
		int[][] mat = new int[size][size];
		
		System.out.println("Enter the matrix:: ");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				mat[i][j]= scan.nextInt();
			}
		}
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(i>j) {
					mat[i][j]=0;
				}
			}
		}
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
