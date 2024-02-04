import java.util.Scanner;

public class Ex12 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);

		int openSafari = 10;
		int closeSafari = 20;
		int visitSafari, timeLeft;

		System.out.println("When are you going to visit the safari?");
		visitSafari = s.nextInt();

		if (visitSafari>= openSafari && visitSafari<closeSafari){
			timeLeft = closeSafari - visitSafari;
			System.out.println("The time you have left to spend on safari is: " + timeLeft + " hours");
		}else
			System.out.println("Sorry, but the safari is currently closed, " +
					"try again tomorrow during business hours, thanks :)" );

	}
}