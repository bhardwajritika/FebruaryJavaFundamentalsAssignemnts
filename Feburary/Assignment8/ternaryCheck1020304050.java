package assignment8;
import java.util.*;

public class ternaryCheck1020304050 {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter number:: ");
		int num= scan.nextInt();
		
		String result = (num==10)?"Equal to 10":(num==20)?"Equal to 20":(num==30)?"Equal to 30":(num==40)?"Equal to 40":(num==50)?"Equal to 50":"number is other than 10,20,30,40,50";
		System.out.print(result);
	}

}
