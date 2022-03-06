package assignment17;
import java.util.*;

public class ArraySumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 10 elements of array:: ");
		int[] array = new int[10];  
		
		for(int i=0;i<10;i++){
			array[i]=scan.nextInt();
		}
		int sum=0;
		for(int j=0;j<10;j++) {
			sum=sum+array[j];
		}
		System.out.println(sum);
		

	}

}
