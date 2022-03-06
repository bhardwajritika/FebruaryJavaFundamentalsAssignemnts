package assignment17;

import java.util.Scanner;

public class ArrayCountOddEvenElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 10 elements of array:: ");
		int[] array = new int[10];  
		
		for(int i=0;i<10;i++){
			array[i]=scan.nextInt();
		}
		int count_even=0;
		int count_odd = 0;
		for(int i=0;i<10;i++){
			if(array[i]%2==0) {
				count_even++;
			}
			else 
				count_odd++;
		}
		System.out.println("even_count:: "+count_even);
		System.out.println("odd_count:: "+count_odd);
		

	}

}
