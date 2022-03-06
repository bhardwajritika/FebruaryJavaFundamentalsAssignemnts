package assignment15;
import java.util.*;

public class ThreeMethodsMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of values to compare:: ");
		int num = scan.nextInt();
		if(num==2) {
			System.out.println("Enter two numbers ::");
			int val1 = scan.nextInt();
			int val2 = scan.nextInt();
			int result = max2(val1, val2);
			System.out.println(result);
		}
		if(num==3) {
			System.out.println("Enter three numbers ::");
			int val1 = scan.nextInt();
			int val2 = scan.nextInt();
			int val3 = scan.nextInt();
			int result = max3(val1, val2, val3);
			System.out.println(result);
		}
		if(num==4) {
			System.out.println("Enter four numbers ::");
			int val1 = scan.nextInt();
			int val2 = scan.nextInt();
			int val3 = scan.nextInt();
			int val4 = scan.nextInt();
			int result = max4(val1, val2, val3, val4);
			System.out.println(result);
		}

		
		

	}
	
	public static int max2(int a, int b) {
		
		return (a>b?a:b);
	}
public static int max3(int a, int b, int c) {
		
		return (a>b&a>c?a:b>a&b>c?b:c>a&c>b?c:0);
	}
public static int max4(int a, int b, int c, int d) {
	
	return (a>b&a>c&a>d?a:b>a&b>c&b>d?b:c>a&c>b&c>d?c:d>a&d>b&d>c?d:0);
}
	

}
