import java.util.Scanner;
public class NumberOfPower {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int number, power, result;
		System.out.println("Enter a Number: ");
		number = s.nextInt();
		System.out.println("Enter a Power: ");
		power = s.nextInt();
		switch (power)
		{
			case 0:
				result = 1;
				System.out.println("The result of " +number + "^0 is: " +result);
				break;
			case 1:  result = number ;
				System.out.println("The result of " + number + "^1 is: " + result);
				break;
			case 2:  result = number * number;
				System.out.println("The result of " + number + "^2 is: " + result);
				break;
			case 3:  result = number*number*number;
				System.out.println("The number of "+ number +"^3 is: " +result);
				break;
			default:
				System.out.println("You entered an incorrect number");
		}

	}
}
//מדפיסה חזקות למספר