package assignment23;

public class HandleExceptionUsingThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=0;
		
		int arr[]= {1,2,3,4,5};
		
		try {
			if(y==0) throw new ArithmeticException();
			
			
			int z=x/y;
			int a = arr[6];
		}
		catch(ArithmeticException ex) {
			System.out.println("Exception catched...");
		}

	}

}
