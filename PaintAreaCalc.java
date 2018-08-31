import java.util.Scanner;

public class PaintAreaCalc
{
	public static void main(String[] args)
	{

		Scanner scan = new Scanner(System.in);
		//declare variables
		int length, height, width, doors, windows, doorArea, windowArea, area;
		//collect room information
		System.out.println("Enter room height: ");
		height = scan.nextInt();
		System.out.println("Enter room width: ");
		width = scan.nextInt();
		System.out.println("Enter room length: ");
		length = scan.nextInt();
		System.out.println("Enter number of windows: ");
		windows = scan.nextInt();
		System.out.println("Enter number of doors: ");
		doors = scan.nextInt();
		//calculate area
		doorArea = (doors * 21);
		windowArea = (windows * 12);
		area = ((((length * height) * 2) + ((width * height) * 2)) - (windowArea + doorArea));
		System.out.println("Total area is: " + area);

	}
}