package assignment7;

import java.util.*;

public class factorial_yes_again {
	static int factorial(int n) {
		int fact = 1;
		int i = 1;

		while (i <= n) {
			fact = fact * i;
			i++;
		}

		return fact;
	}

	public static void main(String args[]) {
		char b;

		do {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter number for factorial:: ");
			int num = scan.nextInt();

			int fact = factorial(num);
			System.out.println("Factorial of " + num + " is: " + fact);

			System.out.println("Continue(Y/N)");
			Scanner sc = new Scanner(System.in);
			String a = sc.nextLine();
			b = (char) a.charAt(0);
		} while (b == 'Y' || b == 'y');

	}
}
