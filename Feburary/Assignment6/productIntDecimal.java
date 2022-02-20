
package assignment6;
import java.util.*;

public class productIntDecimal {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter int value:");
		int a = scan.nextInt();
		System.out.println("Enter double value:");
		double b = scan.nextDouble();
		double prod = a*b;
		
		System.out.print(prod);
	}

}
