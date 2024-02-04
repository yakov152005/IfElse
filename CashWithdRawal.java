import java.util.Scanner;
public class CashWithdRawal {
	public static void main (String []args){
		Scanner s = new Scanner(System.in);

		int password = 1234;
		int cashWithdrawal, enteringPassword;
		int moneyAccount = 10000;
		int amountMachine = 5000;

		System.out.println("Enter your password; ");
		enteringPassword = s.nextInt();

		if (enteringPassword == password){
			System.out.println("How much money would you like to withdraw? ");
			cashWithdrawal = s.nextInt();
			if (cashWithdrawal<=moneyAccount && cashWithdrawal<=amountMachine){
				moneyAccount = (moneyAccount-cashWithdrawal);
				System.out.println("The amount withdrawn is: " + cashWithdrawal);
				System.out.println("Your account balance is: " + moneyAccount);
			}else {
				System.out.println("Sorry but there is not enough money in the machine or in your account.");
			}
		}else {
			System.out.println("Sorry but you entered the wrong code, please take the card.");
		}
		System.out.println(" ");
	}

}
//תוכנית שמושכת כסף מהכספומט