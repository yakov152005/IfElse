import java.util.Scanner;
public class SecondsToDays {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		final int DAY = 86400, HOUR= 3600, MINUTE = 60;
		int second, minute1, hour1, day1;

		System.out.println("Enter a seconds: ");
		second = s.nextInt();

		day1 = second/DAY;
		second = second % DAY;
		hour1 = second/HOUR;
		second = second % HOUR;
		minute1 = second/MINUTE;
		second = second % MINUTE;


		System.out.println("days|" + day1 + "| hours|" + hour1 + "| minute|" + minute1 + "| second|" +second + "|");
	}
}
//מקלידים מספר בשניות וזה מחשב כמה זה בימים שעות דקות ושניות