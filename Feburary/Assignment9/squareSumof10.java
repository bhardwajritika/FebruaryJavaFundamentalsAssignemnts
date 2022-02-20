package assignment9;

public class squareSumof10 {
	public static void main(String args[]) {
		
		int num =10;
		int sum=0;
		int square;
		for(int i=1;i<=10;i++) {
			square = i*i;
			sum = sum+square;
		}
		System.out.println("result is::"+sum);
	}

}
