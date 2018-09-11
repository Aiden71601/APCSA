import java.util.Scanner;

public class FormatPractice {
	public static void main(String[] args){
		//assign variables
		int numItems = 15;
		int gasPoints = 100;
		double subtotal = 142.18;
		double tax = 5.66;
		double total = 147.84;

		System.out.printf("%30s", "Number of items purchased:");
		System.out.printf("%10d", numItems);
		System.out.println();
		System.out.printf("%30s", "Subtotal:");
		System.out.printf("%10.2f", subtotal);
		System.out.println();
		System.out.printf("%30s", "Tax:");
		System.out.printf("%10.2f", tax);
		System.out.println();
		System.out.printf("%40s", "______");
		System.out.println();
		System.out.printf("%30s", "Total:");
		System.out.printf("%10.2f", total);
		System.out.println();
		System.out.println();
		System.out.printf("%30s", "Gas points earned:");
		System.out.printf("%10d", gasPoints);
		System.out.println();
	}
}