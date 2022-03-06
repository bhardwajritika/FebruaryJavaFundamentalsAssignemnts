package assignment14;

public class PatternInvertedV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,k=0;
		for(i=4;i>=0;i--) {
			for(j=4;j>k;j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for(j=1;j<(k*2);j++) {
				System.out.print(" ");
			}
			if(i<5-1) {
				System.out.print("*");
			}
			System.out.println();
			k++;
		}
		
	}

}
