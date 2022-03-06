package assignment11;
import java.util.*;

public class CheckEvenOddFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		boolean result = EvenOdd(num);
		if(result==true) {
			System.out.println("even");
		}
		else
			System.out.println("odd");

	}
	public static boolean EvenOdd(int n) {
		if(n%2==0) {
			return true;
		}
		else
			return false;
	}

}
