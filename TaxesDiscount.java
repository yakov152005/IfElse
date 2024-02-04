import java.util.Scanner;

public class TaxesDiscount {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double salary, taxes;
        boolean adult, closeGulliver;
        int kids;

        print("Enter your salary: ");
        salary = s.nextInt();
        if (salary<5000) {
            taxes = 0;
        }
        else if (salary>=5000 && salary<10000){
            taxes= (0.1*salary);
        }
        else if  (salary>=10000 && salary<15000){
            taxes = (0.35*salary);
        }
         else  {taxes = (0.5*salary);
        }

         print("are you adult? ");
         adult = s.nextBoolean();

        if (adult){
            print("are you live close to gulliver? ");
            closeGulliver = s.nextBoolean();

            if (closeGulliver && salary<10000){
                taxes-=400;
            }

            print("How many kids? ");
            kids = s.nextInt();

            if (kids>=3)
            {
                taxes-=900;
            }else {
                taxes-=(kids*300);
            }
        }
        else { taxes = (taxes*0.5);
        }

        print("Please pay: " + taxes + "$ for taxes");



    }
    public static void print(String s) {System.out.println(s);}
}
