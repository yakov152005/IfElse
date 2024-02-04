import java.util.Scanner;
public class Ex5 {
	public static void main (String[] args){

		Scanner s = new Scanner(System.in);
		int length, width;

		System.out.println("Please enter the length of a rectangle: ");
		length = s.nextInt();
		System.out.println("Please enter a rectangle width: ");
		width = s.nextInt();

		int areaRectangle = (length*width);
		int perimeterRectangle = (length*2) + (width*2);

		System.out.print("The area of the Rectangle is-->|" + areaRectangle +"|" );
		System.out.print(" The perimeter of the rectangle--> |" + perimeterRectangle + "|");
	}
}
//תוכנית המבקשת מהמשתמש להכניס אורך ורוחב של מלבן, ולאחר מכן מדפיסה את היקפו ואת שטחו של המלבן.