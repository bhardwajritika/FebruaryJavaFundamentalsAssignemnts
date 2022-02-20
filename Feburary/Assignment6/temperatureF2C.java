package assignment6;
import java.util.*;
public class temperatureF2C {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter temperature in Fahrenheit::");
		double ftemp= scan.nextDouble();
		double ctemp = ((ftemp-32)*5)/9 ;
		System.out.print("Temperature in celsius:: "+ctemp);
		
	}

}
