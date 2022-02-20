package assignment6;
import java.util.*;

public class reverseString {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter city name:: ");
		String str = scan.nextLine();
		String reverse_str="";
	        char ch;
	       
	       
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); 
	        reverse_str= ch+reverse_str; 
	      }
	      System.out.println("Reversed word:: "+ reverse_str);
	}

}
