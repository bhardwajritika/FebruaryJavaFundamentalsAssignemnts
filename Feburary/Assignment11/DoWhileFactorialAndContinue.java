package assignment11;
import java.util.*;

public class DoWhileFactorialAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean permission = false;
		do {
		System.out.println("Enter number for factorial:: ");
		int num = scan.nextInt();
		int fact=1;
		for(int i =1;i<=num;i++) {
		if(num==0) { System.out.println(num);
			
		}
		fact = fact*i;
		}
		System.out.println(fact);
		System.out.println("Want to continue:: y/n");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(str.equals("y")) {
			permission = true;
		}
		if(str.equals("n")) {
			permission = false;
		}
		} while(permission); 
		

	}

}
