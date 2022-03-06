package assignment10;
import java.util.*;

public class checkNumDivisibleBy2and8not12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if(num%2==0 && num%8==0 && num%12!=0) {
			System.out.println("number is divisible by 2 and 8 but not divisible by 12");
		}
		else {
			System.out.println("condition not matched");
		}
		

	}

}
