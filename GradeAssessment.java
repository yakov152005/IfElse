import java.util.Scanner;
public class GradeAssessment {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int grade;
		System.out.println("Enter a grade: ");
		grade =s.nextInt();
		if (grade>90 && grade<=100){
			System.out.println("Excellent");
		} else if (grade>70 && grade<=90) {
			System.out.println("Good");
		} else if (grade>60 && grade<=70) {
			System.out.println("Pass");
		} else if (grade>0 && grade<60) {
			System.out.println("Fail");
		}else {
			System.out.println("Invalid Input");
		}

	}
}
//אומרת לפי הציון במספרים מה הציון במילים