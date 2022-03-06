package assignment12;
import java.util.*;

public class CheckNumBetween1and10andEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num= scan.nextInt();
		
		boolean result = (num>0 && num<=10 && num%2==0)?true:false;
		if(result==true) {
			System.out.println("Number is between 0 to 10 and even.");
		}
		else {
				System.out.println("Number is not between 0 to 10 or even.");
			}


	}

}
