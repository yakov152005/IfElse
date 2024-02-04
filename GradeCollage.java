import java.util.Scanner;

public class GradeCollage {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int attendance;
        int examGrade, middleExamGrade, homeWorkGrade, finalGrade;
        double  tempGrade;

        print("Enter attends %: ");
        attendance = s.nextInt();
        if (attendance>80) {

            print("Enter exam grade: ");
            examGrade = s.nextInt();
            if (examGrade >=60) {

                print("Enter your middle exam Grade: ");
                middleExamGrade = s.nextInt();
                print("Enter the homework grade:  ");
                homeWorkGrade = s.nextInt();

                if (middleExamGrade>examGrade){
                    tempGrade = (0.8*examGrade + 0.2*middleExamGrade);

                }else {tempGrade=examGrade;}

                finalGrade = (int) (0.1*homeWorkGrade + 0.9*tempGrade);
                print("your total grade is: " + finalGrade);


            }else print("your total grade is: " + examGrade);

        } else
            print("your final grade is: 0");

    }
    public static void print(String s) {System.out.println(s);}
}
