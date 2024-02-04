import java.util.Scanner;

public class IFelseCheck {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x, y, z, max;

        print("Please enter 3 numbers: ");
        x = s.nextInt();
        y = s.nextInt();
        z = s.nextInt();

        if (x>y && x>z) {
            max = x;
        }
        else if (y>x && y>z) {
            max = y;
        }
        else {
            max = z;
        }

        print(max + " is the maximum");



    }
    public static void print(String s) {System.out.println(s);}
}
