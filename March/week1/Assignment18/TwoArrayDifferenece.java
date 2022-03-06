package assignment18;
import java.util.*;

public class TwoArrayDifferenece {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of arrays:: ");
		int len = scan.nextInt();
		System.out.println("Enter elements of first array:: ");
		int[] array1 = new int[len]; 
		
		
		for(int i=0;i<len;i++){
			array1[i]=scan.nextInt();
		}
		System.out.println("Enter elements of second array:: ");
		int[] array2 = new int[len]; 
		
		
		for(int i=0;i<len;i++){
			array2[i]=scan.nextInt();
		}
		int[] array3 = new int[len]; 
		for(int i=0;i<len;i++){
			array3[i]=array1[i]-array2[i];
			System.out.println(array3[i]);
		}
		
		
		

	}

}
