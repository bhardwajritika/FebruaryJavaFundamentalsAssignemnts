package assignment10;
import java.util.*;

public class seventermsDivisibleBy6 {

	public static void main(String[] args) {
		int count= 0;
		int num;
		// TODO Auto-generated method stub
		for(int i = 0;count<7;i++) {
			num = i*6*i;
			if(num%6==0) {
				System.out.println(num);
				count++;
			}
		}

	}

}
