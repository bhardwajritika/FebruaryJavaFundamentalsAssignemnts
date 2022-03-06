package assignment15;

public class MethodAddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2 = 20;
		int result = sum(num1,num2);
		System.out.print("Sum = "+ result);

	}
	
	public static int sum(int a,int b) {
		int add = a+b;
		return add;
	}

}
