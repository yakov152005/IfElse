import java.util.Scanner;

public class HouseCommitteePayment {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int rooms, price = 0;
        boolean isDuplex;
        boolean isNumOfRoomsOk = true;


        print("how many rooms do you have? ");
        rooms = s.nextInt();

        if (rooms == 3) {
            price = 120;
        }
        else if (rooms == 4) {
           price = 150;
        }
        else if (rooms == 5){
            print("Its a Duplex? (true/false) ");
            isDuplex = s.nextBoolean();
            if (isDuplex) {
                price = 200;
            } else {
                price = 180;
            }
        }
        else
            isNumOfRoomsOk = false;

        if (isNumOfRoomsOk)
         print("you need to pay a: " + price);
        else
        {
            print("Invalid num of rooms ");
        }

    }
    public static void print(String s) {System.out.println(s);}
}
