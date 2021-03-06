package assignment18;

import java.util.Scanner;

public class BinarytoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long num = scan.nextLong();

	    // call method by passing the binary number
	    int decimal = convertBinaryToDecimal(num);

	    System.out.println("Binary to Decimal");
	    System.out.println(num + " = " + decimal);

	}
	public static int convertBinaryToDecimal(long num) {
	    int decimalNumber = 0, i = 0;
	    long remainder;
	    
	    while (num != 0) {
	      remainder = num % 10;
	      num /= 10;
	      decimalNumber += remainder * Math.pow(2, i);
	      ++i;
	    }
	    
	    return decimalNumber;
	  }

}
