import java.util.Scanner;
public class Ex9 {
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		int integer;
		int unityDigit;

		System.out.println("Enter a Number: ");
		integer = s.nextInt();

		if (integer>=10){
			unityDigit = integer%10;
			System.out.println("The unity digit is: " + unityDigit);
		}else
			System.out.println("The unity digit is: " + integer);

	}
}
//תוכנית הקולטת מהמשתמש מספר שלם כלשהו, ומדפיסה על המסך את ספרת האחדות של אותו מספר