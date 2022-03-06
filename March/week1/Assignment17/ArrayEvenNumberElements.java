package assignment17;

import java.util.Scanner;

public class ArrayEvenNumberElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 10 elements of array:: ");
		int[] array = new int[10];  
		
		for(int i=0;i<10;i++){
			array[i]=scan.nextInt();
		}
		for(int i=0;i<10;i++){
			if(array[i]%2==0) {
				System.out.println(array[i]);
			}
		}
		

	}

}
