import java.util.Scanner;

public class TirgolifElse {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        char letter;

        print("Enter a letter: ");
        letter = s.next().charAt(0);

        if ((letter >='a'&& letter <='z') || (letter >='A' && letter <='Z')) {
            print("this is a tav ");
        }

        else if (letter >='0' && letter <= '9') {
            print("this is a number ");
        }
        else {
            print("this a sign ");
        }



    }
    public static void print(String s) {System.out.println(s);}
}
