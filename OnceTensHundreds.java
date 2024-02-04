import java.util.Scanner;

public class OnceTensHundreds {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);

			int number;
			System.out.println("pls enter a number: ");
			number =s.nextInt();

			int once = number%10;
			int tens = (number/10)%10;
			int hundreds = number/100;

			System.out.println("Ones: " + once + " Tens: " + tens + " Hundreds: " + hundreds);
		}
	}

