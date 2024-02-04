import java.util.Scanner;

public class BooleanCheck {
    public static void main(String[] args) {
        int x=5, y=3;
        boolean res, der, nez;

        int z;
        Scanner s = new Scanner(System.in);

        print("Enter your number: ");
        z = s.nextInt();

        if ( nez = z==6 || z==7){
            print("Its " + nez);
        }

        else {
            print("Its False");
        }

        res = x>4 && x<9;
        print("Its " + res);

        der = y >=3 || y>5;
        print("Its " + der);

    }
    public static void print(String s) {System.out.println(s);}
}

  //  int a=5, y=7;
  //  boolean res;
     //   res = y<a;
       // print("its " + res );