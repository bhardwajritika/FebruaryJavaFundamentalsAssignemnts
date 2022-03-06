package assignment11;
import java.util.*;

public class CalculateFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int fact=1;
		
		for(int i=1;i<=num;i++) {
			fact = fact*i;
		}
		System.out.println(fact);

	}

}
