package assignment15;
import java.util.*;

public class ThreeMethodsMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two integers:: ");
		int integer1 = scan.nextInt();
		int integer2 = scan.nextInt();
		System.out.println("Enter two float values:: ");
		float float1= scan.nextFloat();
		float float2 = scan.nextFloat();
		System.out.println("Enter two double values:: ");
		double double1 = scan.nextDouble();
		double double2 = scan.nextDouble();
		
		int result1 = intFunction(integer1, integer2);
		float result2 = floatFunction(float1,float2);
		double result3 = doubleFunction(double1,double2);
		
		System.out.println("Sum of integers :: "+result1);
		System.out.println("Sum of floats :: "+result2);
		System.out.println("Sum of doubles :: "+ result3);
	}
	
	public static int intFunction(int a, int b) {
		return(a+b);
	}
	public static float floatFunction(float a, float b) {
		return(a+b);
	}
	public static double doubleFunction(double a, double b) {
		return(a+b);
	}

}
