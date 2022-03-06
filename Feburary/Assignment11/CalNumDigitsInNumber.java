package assignment11;
import java.util.*;

public class CalNumDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int count =0;
		while(num>0) {
			num = num/10;
			count++;
		}
		
		System.out.println(count);
	}

}
