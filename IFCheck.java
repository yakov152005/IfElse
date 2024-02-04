import java.util.Scanner;

public class IFCheck {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x, y, z;

        print("Enter a Number one: ");
        x = s.nextInt();
        print("Enter a Number two: ");
        y = s.nextInt();
        print("Enter a Number three: ");
        z = s.nextInt();

        if (x>y && x>z) {
            print("The Max Number its: " + x);
        }
        else if (y>z) {
            print("the max number its: " + y);
        }
        else if (z>y) {
            print("the max number its: " + z);
        }




    }
    public static void print(String s) {System.out.println(s);}
}
