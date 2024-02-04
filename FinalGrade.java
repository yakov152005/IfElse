import java.util.Scanner;

public class FinalGrade {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int grade, finalGrade , assignments, assignmentAvg;

        print("enter your grade: ");
        grade = s.nextInt();
        print("enter Submitted assignments: ");
        assignments = s.nextInt();


        if (grade >= 60) {
            if (assignments <= 4) {
                finalGrade = grade;
                print("your Final Grade is: " + finalGrade);
            }
            else
                print("enter Grade Assignment: ");
                 assignmentAvg = s.nextInt();

                if (assignments >= 5 && assignments <= 7) {
                finalGrade = (int)(grade * 0.8 + assignmentAvg*0.2);
                print("your Final Grade is: " + finalGrade);
            }
            else if (assignments >= 8) {
                finalGrade = (int) (grade * 0.7 + assignmentAvg*0.3);
                print("your Final Grade is: " + finalGrade);
            }

        }
        else
            if (assignments <= 4) {
            finalGrade = grade;
                print("your Final Grade is: " + finalGrade);
            }
        else
                print("enter Grade Assignment: ");
                assignmentAvg = s.nextInt();

            if (assignments >= 5 && assignments <= 7){
                finalGrade = (int) (grade*0.9 + assignmentAvg*0.1);
                print("your Final Grade is: " + finalGrade);
            }
            else if (assignments >= 8) {
                finalGrade = (int) (grade*0.6 + assignmentAvg*0.4);
                print("your Final Grade is: " + finalGrade);
            }

    }
    public static void print(String s) {System.out.println(s);}
 }
