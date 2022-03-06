package assignment13;
import java.util.*;

public class patternLeftTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of the triangle:: ");
		int length = scan.nextInt();
		for(int i=0;i<length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
