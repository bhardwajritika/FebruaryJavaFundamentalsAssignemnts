package assignment5;
import java.util.*;

public class leftTrianglePattern {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter height of Triangle:: ");
		int a = scan.nextInt();
		for (int i = 1; i <= a; i++) {

			for (int j = a-1; j >= i; j--) {

				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
