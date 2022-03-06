package assignment16;
import java.util.*;

public class MethodSwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two number to swap:: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		swap(num1,num2);

	}
	public static void swap(int a, int b) {
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println("Number after swap:: "+ a+" "+b);
	}

}
