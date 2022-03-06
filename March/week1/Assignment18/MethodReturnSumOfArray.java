package assignment18;

import java.util.Scanner;

public class MethodReturnSumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of arrays:: ");
		int len = scan.nextInt();
		AddElements(len);
	}
	public static void AddElements(int a) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter elements of array:: ");
		int[] array = new int[a]; 
		
		
		for(int i=0;i<a;i++){
			array[i]=scan.nextInt();
		}
		int sum=0;
		for(int i=0;i<a;i++){
			sum = sum + array[i];
		}
		System.out.println(sum);		
	}
	}


