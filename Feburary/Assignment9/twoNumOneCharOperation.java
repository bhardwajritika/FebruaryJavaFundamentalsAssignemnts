package assignment9;
import java.util.*;

public class twoNumOneCharOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:: ");
		int a = scan.nextInt();
		System.out.println("Enter second number:: ");
		int b = scan.nextInt();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  operator(+,-,*,/):: ");
		String c = sc.nextLine();

		if(c.equals("+")) {
			System.out.println("Result:: "+(a+b));
		}
		else if(c.equals("-")) {
			System.out.println("Result:: "+(a-b));
		}
		else if(c.equals("*")) {
			System.out.println("Result:: "+(a*b));
		}
		else if(c.equals("/")) {
			System.out.println("Result:: "+(a/b));
		}
		else {
			System.out.print("wrong operator choice");
		}
	}

}
