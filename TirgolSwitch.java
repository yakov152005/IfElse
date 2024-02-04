import java.util.Scanner;

public class TirgolSwitch {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       char op;
       int num1, num2, res;

       print("Please Enter a math expression (with spaces): ");
       num1 = s.nextInt();
       op = s.next().charAt(0);
       num2 = s.nextInt();

       switch (op) {
           case '+':
               res = num1 + num2;
               print("The result is: " + res );
               break;
           case '-':
               res = num1 - num2;
               print("The result is: " + res );
               break;
           case '*':
               res = num1 * num2;
               print("The result is: " + res );
               break;
           default:
               print("Invalid operand");
               break;
       }


    }
    public static void print(String s) {System.out.println(s);}
}
