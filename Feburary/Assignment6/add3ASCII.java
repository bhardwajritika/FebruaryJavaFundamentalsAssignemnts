package assignment6;

import java.util.Scanner;

public class add3ASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the character:: ");
		String a = scan.nextLine();
		char character = a.charAt(0);
		int b = (int)character +3;
		char newCharacter = (char)b;
		System.out.println(newCharacter);
	}

}
