import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int side1, side2;
		double yeter;

		System.out.println("Enter a side 1: ");
		side1 = s.nextInt();
		System.out.println("Enter a side 2:");
		side2 = s.nextInt();

		yeter = (side1 * side1) + (side2 * side2);
		double shorash = Math.sqrt(yeter);
		System.out.println("The shorash to Yeter is: " + shorash);
	}
}
//מחשב את היתר במשולש