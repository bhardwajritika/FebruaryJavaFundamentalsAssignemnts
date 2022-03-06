package assignment16;
import java.util.*;

public class MethodReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to reverse :: ");
		int num = scan.nextInt();
		
		reverse(num);
		
		

	}
	public static void reverse(int a) {
		int reverse =0;
		for( ;a != 0; a=a/10)   
		{  
		int remainder = a % 10;  
		reverse = reverse * 10 + remainder;
		
		} 
		System.out.println(reverse);
	}

}
