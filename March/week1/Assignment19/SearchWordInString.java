package assignment19;
import java.util.*;

public class SearchWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 
		System.out.print("Enter String: "); 
		String str = sc.nextLine();
		System.out.print("Enter word to search: ");
		String word =sc.next();
		
		int index = str.indexOf(word); 
		if(index >= 0){
			System.out.print("Search Found index: ");
			System.out.println(index);
		} else {
			System.out.println("No Search Found!");
		}	

	}

}
