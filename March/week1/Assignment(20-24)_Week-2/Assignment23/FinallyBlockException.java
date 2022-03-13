package assignment23;


public class FinallyBlockException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=0;
		
		try {
			int z=x/y;
		}
		catch(Exception ex) {
			System.out.println("Exception catched....");
		}
		
		finally {
			System.out.println("We are in finally block....");
		}
		

	}

}
