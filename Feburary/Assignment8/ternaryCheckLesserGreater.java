package assignment8;
import java.util.*;

public class ternaryCheckLesserGreater {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to check:: ");
		int num = scan.nextInt();
		
		String result = (num>10)?"Greater than 10":((num>5)?"Greater than 5 but less than 10":"less than 5");
		System.out.println(result);
	}

}
