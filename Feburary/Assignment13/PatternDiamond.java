package assignment13;


public class PatternDiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =0; i<5; i++) {
			for(int j = 3-i;j>=0;j--) {
				System.out.print(" ");}
				for(int z =0;z<2*i-1;z++) {
					System.out.print("*");
				}
				System.out.println();

	}
		for(int a = 3;a>0;a--) {
			for(int b = 0;b+a<=3;b++) {
				System.out.print(" ");
			}
			for(int c = 0;c<2*a-1;c++) {
				System.out.print("*");
			}
			System.out.println();
		}

}
	}
