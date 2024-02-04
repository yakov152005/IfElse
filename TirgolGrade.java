import java.util.Scanner;

public class TirgolGrade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int grade;

        print("Please Enter a Grade: ");
        grade = s.nextInt();

        if (grade>=90){
            print("Excellent");
        }
        else if (grade>= 80 && grade<90) {
            print("Very Good");
        }
        else if (grade>=60 && grade<80) {
            print("Passed");
            if (grade >= 60 && grade < 70) {
                print("You should work harder!");
            }
        }
        else {
            print("Failed");
        }

    }
    public static void print(String s) {System.out.println(s);}
}
