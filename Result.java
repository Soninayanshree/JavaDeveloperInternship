import java.util.*;
class Result{
	public static void main(String args[]){
		int marks;
		int total_marks;
		int avg_marks;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of five subject (1-100):");
		int eng = sc.nextInt();
		int maths = sc.nextInt();
		int phy = sc.nextInt();
		int chem = sc.nextInt();
		int hindi = sc.nextInt();
		total_marks = eng + maths + phy + chem + hindi;
		
		avg_marks = total_marks/5;
		String grade = "0";
		if(avg_marks > 100){
			System.out.println("Please enter correct number: ");
			System.exit(0);
		}
		else if(avg_marks < 100 && avg_marks > 85){
			grade = "A";
		}
		else if(avg_marks < 85 && avg_marks> 65){
			grade = "B";
		}
		else if(avg_marks < 65 && avg_marks > 45){
			grade = "C";
		}
		else if(avg_marks < 45 && avg_marks > 35){
			grade = "D";
		}
		else {
			grade = "Fail";
		}
		System.out.println("Total marks :" + total_marks);
		System.out.println("Average percentage :" + avg_marks + "%");
		System.out.println("Grade: " + grade);
		
	}
}