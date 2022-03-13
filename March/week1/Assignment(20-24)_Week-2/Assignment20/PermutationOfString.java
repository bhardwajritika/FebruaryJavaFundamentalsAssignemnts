package assignment20;
import java.util.*;

public class PermutationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		int n = str.length();
		PermutationOfString permute1 = 
		        new PermutationOfString(); 
		        permute1.permute(str, 0, n-1); 
		
		permute1.permute(str,0,n);
		
		
	}
	public void permute(String str1,int i, int j) {
		if(i==j) {
			System.out.println(str1);
		}
		else {
			for(int x=i; x<j;x++) {
			str1 = swap(str1,i,x);
			permute(str1,i+1,j);
			str1 = swap(str1,i,x);
				
		}
		}
	}
	
	public String swap(String a, int i, int j) {
		char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
		
	}

}
