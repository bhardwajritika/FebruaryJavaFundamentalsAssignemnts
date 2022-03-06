package assignment15;
import java.util.*;

public class methodCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Select operations(1-add, 2-subtract, 3-multiple, 4- divide, 5-average, 6-modulo) :: ");
		int opp = scan.nextInt();
		System.out.println("Enter two numbers :: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		if(opp==1) {
			int result = add(num1, num2);
			System.out.println(result);
		}
		if(opp==2) {
			int result = sub(num1, num2);
			System.out.println(result);
		}
		if(opp==3) {
			int result = multiple(num1, num2);
			System.out.println(result);
		}
		if(opp==4) {
			int result = div(num1, num2);
			System.out.println(result);
		}
		if(opp==5) {
			int result = avg(num1, num2);
			System.out.println(result);
		}
		if(opp==6) {
			int result = mod(num1, num2);
			System.out.println(result);
		}

	}
	
	public static int add(int a, int b) {
		return (a+b);
	}
	public static int sub(int a, int b) {
		return (a-b);
	}
	public static int multiple(int a, int b) {
		return (a*b);
	}
	public static int div(int a, int b) {
		return (a/b);
	}
	public static int avg(int a, int b) {
		return ((a+b)/2);
	}

	public static int mod(int a, int b) {
		return (a%b);
	}





}
