import java.util.Scanner;

public class ClothingStoreDiscounts {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int pay, numOfItems, discount1;
        double discount2;


        print("Please enter total price?");
        pay = s.nextInt();
        print("How many clothes did you take? ");
        numOfItems = s.nextInt();

        discount1 = pay - (pay/300)*50;

        if (numOfItems>=3) {
            discount2 = pay - (pay*0.2) ;
        }
        else{
            discount2 = pay;
        }
        if (discount1<discount2){
            print("price after discount 1 is: " + discount1);
        }
        else print("price after discount 2 is: " + discount2);



    }
    public static void print(String s) {System.out.println(s);}
}
