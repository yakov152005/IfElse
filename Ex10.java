import java.util.Scanner;

public class Ex10 {
	public static void main (String[] args){
		Scanner s = new Scanner(System.in);

		int twoDigit;
		int tensDigit;

		System.out.println("Please Enter a Two-digit number:");
		twoDigit = s.nextInt();

		if (twoDigit>=10) {
			tensDigit = twoDigit / 10;
			System.out.println("The tens-digit is: " + tensDigit);

		}else
			System.out.println("You entered a number that is not two digits, please try again :) ");

	}
}
//תוכנית הקולטת מהמשתמש מספר דו-ספרתי, ומדפיסה על המסך את ספרת העשרות שלו