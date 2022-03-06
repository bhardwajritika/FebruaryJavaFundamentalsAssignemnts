package assignment19;
import java.util.*;
public class ReplaceSubstringInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the main string::  ");
		String str = scan.nextLine();
		System.out.println("Enter substring to be replaced::  ");
		String sub = scan.nextLine();
		System.out.println("Enter new substring to be added::  ");
		// Replace a char in String
		String newsub = scan.nextLine();
		str = str.replace(sub, newsub);
		System.out.println(str);

	}

}
