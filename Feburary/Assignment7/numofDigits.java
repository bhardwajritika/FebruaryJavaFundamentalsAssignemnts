package assignment7;
import java.util.*;
public class numofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your number:: ");
		int num = scan.nextInt();
		int i=0;
		for( i=0;num>0;i++) {
			num=num/10;
		}
		System.out.println("NUmber of digits are:: "+i);
	}

}
