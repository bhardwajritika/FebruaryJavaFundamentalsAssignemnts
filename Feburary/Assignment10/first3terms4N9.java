package assignment10;

public class first3terms4N9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		
		for(int i=0;count<3;i++) {
			int num = 4*i+9;
			if(num%3==0) {
				System.out.println(num);
				count++;
			}
		}
	}

}
