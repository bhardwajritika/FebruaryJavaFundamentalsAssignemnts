package assignment18;

import java.util.Scanner;

public class ArrayReturnFirstIndexElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 10 elements of array:: ");
		int[] array = new int[10];  
		
		for(int i=0;i<10;i++){
			array[i]=scan.nextInt();
		}
		System.out.println("Enter element to search in array:: ");
		int ele = scan.nextInt();
		for(int j=0;j<10;j++) {
			if(array[j]==ele) {
				System.out.println(j);
				break;
			}
		}

	}

}
