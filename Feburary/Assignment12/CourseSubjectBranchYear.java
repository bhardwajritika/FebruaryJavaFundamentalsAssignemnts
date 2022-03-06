package assignment12;
import java.util.*;

public class CourseSubjectBranchYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year(1/2/3/4):: ");
		int year = scan.nextInt();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter branch(ME/CE/CSE/ECE):: ");
		String branch = sc.nextLine();
		switch(year) {
		
		case 1:  System.out.println("Subjects are common for all branches");
		
		break;
		
		case 2: if(branch.equals("CSE")) {
			System.out.println("Subjects of second year, CSE students");
		}
		else if(branch.equals("ECE")) {
			System.out.println("Subjects of second year, ECE students");
		}
		else if(branch.equals("ME")) {
			System.out.println("Subjects of second year, Mechanical students");
		}else if(branch.equals("CE")) {
			System.out.println("Subjects of second year, civil students");
		}
		break;
		
		case 3: if(branch.equals("CSE")) {
			System.out.println("Subjects of third year, CSE students");
		}
		else if(branch.equals("ECE")) {
			System.out.println("Subjects of third year, ECE students");
		}
		else if(branch.equals("ME")) {
			System.out.println("Subjects of third year, Mechanical students");
		}else if(branch.equals("CE")) {
			System.out.println("Subjects of third year, civil students");
		}
		break;
		case 4: if(branch.equals("CSE")) {
			System.out.println("Subjects of fourth year, CSE students");
		}
		else if(branch.equals("ECE")) {
			System.out.println("Subjects of fourth year, ECE students");
		}
		else if(branch.equals("ME")) {
			System.out.println("Subjects of fourth year, Mechanical students");
		}else if(branch.equals("CE")) {
			System.out.println("Subjects of fourth year, civil students");
		}
		break;
		default:
			System.out.println("Invalid......year or branch");
		}

	}

}
