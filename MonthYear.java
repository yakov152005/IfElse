import java.util.Scanner;
public class MonthYear {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int month;
		System.out.println("Enter a Month Number: ");
		month = s.nextInt();

		switch (month)
		{
			case 1:
				System.out.println("The Month Is January");
				break;
			case 2:
				System.out.println("The Month Is February");
				break;
			case 3:
				System.out.println("The Month Is March");
				break;
			case 4:
				System.out.println("The Month Is April");
				break;
			case 5:
				System.out.println("The Month Is May");
				break;
			case 6:
				System.out.println("The Month Is July");
				break;
			case 7:
				System.out.println("The Month Is June");
				break;
			case 8:
				System.out.println("The Month Is August");
				break;
			case 9:
				System.out.println("The Month Is September");
				break;
			case 10:
				System.out.println("The Month Is October");
				break;
			case 11:
				System.out.println("The Month Is November");
				break;
			case 12:
				System.out.println("The Month Is December");
				break;
			default:
				System.out.println("You entered an incorrect number");
		}

	}
}
//בודקת איזה חודש לפי מספר