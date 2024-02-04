import java.util.Scanner;

public class Ex11 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);

		int twoDigit, unityDigit, tensDigit;
		int sumDigit ;

		System.out.println("Please enter a two-digit number: ");
		twoDigit = s.nextInt();
		unityDigit = twoDigit;

		if (twoDigit>=10 && twoDigit<100){
			tensDigit = twoDigit/10;
			unityDigit = unityDigit%10;
			sumDigit = tensDigit + unityDigit;
			System.out.println( " " +tensDigit+ "+" + unityDigit  + "=" + sumDigit);
		}else
			System.out.println("You entered a number that is not two digits, please try again :) ");

	}
}
//תוכנית הקולטת מהמשתמש מספר דו-ספרתי,
// ומדפיסה על המסך את סכום הספרות שלו. לדוגמה, א