package assignment6;
import java.util.*;

public class ASCIIvalue {
	public static void main(String args[]) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the character:: ");
	String a = scan.nextLine();
	char character = a.charAt(0);
	int b = (int)character;
	System.out.println(b);
	
}	

}
