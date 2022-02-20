package assignment7;
import java.util.*;

public class checkFunctionEvenOdd {
	static int Even_Odd(int a) {
		if(a%2==0) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number :: ");
		int num = scan.nextInt();
		
		int result = Even_Odd(num);
		
		if(result==1) {
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
	}

}
