import java.util.Scanner;

public class shortenedIF {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int age;

        print("Please enter your age: ");
        age = s.nextInt();

        print(age<18? "you are a child" : "you are NOT a child");
        }

    public static void print(String s) {System.out.println(s);}
}
 //if (age < 18){
    //    print("you are a child ");}
      //  else {
     //   print("you are not a child");