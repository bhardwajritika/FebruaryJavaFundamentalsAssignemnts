package assignment8;
import java.util.*;

public class ternaryCheckConsonantVowels {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter small letter:: ");
		String a = scan.nextLine();
		char letter = (char)a.charAt(0);
		
		String result = (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')?"Its vowel":"Its consonant";
		System.out.println(result);
	}
}
