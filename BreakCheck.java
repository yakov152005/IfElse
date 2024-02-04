import java.util.Scanner;
public class BreakCheck {
    public static void main (String [] args){

        Scanner s = new Scanner(System.in);
        int num, sum=0;
        char answer;

        while (true) {
            System.out.println("Add another number? (y/n) ");
            answer = s.next().charAt(0);
            if (answer == 'N' || answer == 'n') {
                break;
            }else if (answer =='Y' || answer == 'y'){
                System.out.println("Enter the number: ");
                num = s.nextInt();
                sum += num;
            }else
                System.out.println("Invalid option, Try again :) ");
        }
        System.out.printf("Total sum is: %d", sum);
    }
}
