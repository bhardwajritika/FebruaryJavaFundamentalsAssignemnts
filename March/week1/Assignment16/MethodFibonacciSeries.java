package assignment16;
import java.util.*;

public class MethodFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of fibonacci series:: ");
		int num = scan.nextInt();
		
		fibbonacci(num);

	}
	public static void fibbonacci(int a) {
		 int n1=0,n2=1,n3,i;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<a;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
	}

}
