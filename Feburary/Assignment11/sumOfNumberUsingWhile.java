package assignment11;
import java.util.*;

public class sumOfNumberUsingWhile {
	public static void main(String args) {
		
		Scanner scan  = new Scanner(System.in);
		try {
		int num = scan.nextInt();
		int i=0;
		int sum =0;
		while(i<=num) {
			sum = sum+i;
			i++;
		}
	}
	
	finally {
		scan.close();
	}
	}
}
