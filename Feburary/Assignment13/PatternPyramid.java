package assignment13;
import java.util.*;

public class PatternPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter height of the pyramid:: ");
		int height = scan.nextInt();
		
		for(int i =0; i<height; i++) {
			for(int j = height-i;j>=0;j--) {
				System.out.print(" ");}
				for(int z =0;z<2*i-1;z++) {
					System.out.print("*");
				}
				System.out.println();
				
			
		}

	}

}
