package assignment6;
import java.util.*;
import java.util.Scanner;

public class inch2meter {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter value in inches:: ");
		double inches= scan.nextDouble();
		double meter = inches / 39.37; ;
		System.out.print("Value in meter::  "+meter);
		
	}

}
