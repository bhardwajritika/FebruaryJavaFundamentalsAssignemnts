package assignment9;
import java.util.*;
public class sumOfDigitsInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner(System.in);
		System.out.print("Enter your number:: ");
		int num = scan.nextInt();
		int i=0;
		int sum = 0;
		for( i=0;num>0;i++) {
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("sum of digits are:: "+sum);

	}

}
