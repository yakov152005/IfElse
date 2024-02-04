import java.util.Scanner;

public class SwitchRome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        char romeDigit;
        int decimalNum = 0;
        boolean inputValid = true;

        print("Please enter a rome digit: ");
        romeDigit = s.next().charAt(0);

        switch (romeDigit) {
            case 'i':
            case 'I':
                decimalNum = 1;
                break;
            case 'v':
            case 'V':
                decimalNum = 5;
                break;
            case 'x':
            case 'X':
                decimalNum = 10;
                break;
            default:
                inputValid = false;
                break;
        }

            if (inputValid) {
                print("Num is: " + decimalNum );
            } else
                print("Invalid Input! ");



    }
    public static void print(String s) {System.out.println(s);}
}
