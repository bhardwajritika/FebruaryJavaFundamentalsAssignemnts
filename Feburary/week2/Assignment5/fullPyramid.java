package assignment5;
import java.util.*;


public class fullPyramid {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter height of pyramid::");
		int a= scan.nextInt();
		
		for(int i=1;i<=a;i++) {
			
			for(int j=a;j>i;j--) {
				System.out.print(" ");
			}
				
				for(int k = 1; k<=2*i-1;k++) {
					System.out.print("*");
					
				}
			
			System.out.println();
		}
	}

}
