package assignment10;

import java.util.*;

public class givenNumberPowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		while (num % 2 == 0) {
			num = num / 2;
		}
		if (num == 1) {
			System.out.println("The number is power of two.");
		} else {
			System.out.println("The number is not power of two.");
		}

	}

}
