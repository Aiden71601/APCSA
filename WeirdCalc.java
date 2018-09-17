import java.util.Scanner;
public class WeirdCalc {

	public static void main(String[] args){
		//declare variables
		Scanner scan = new Scanner(System.in);
		final int numNums = 2;
		int num1, num2, distance, maximum, minimum;
		double average;
		//print out values
		System.out.println("Gimme an integer: ");
		num1 = scan.nextInt();
		System.out.println("Gimme another integer: ");
		num2 = scan.nextInt();
		System.out.printf("\nSum:        %10d", (num1 + num2));
		System.out.printf("\nDifference: %10d", (num1 - num2));
		System.out.printf("\nProduct:    %10d", (num1 * num2));
		average = ((double)(num1 + num2)) / numNums;
		System.out.printf("\nAverage:    %13.2f", average);
		System.out.printf("\nDistance:   %10d", (Math.abs(num1 - num2)));
		//calculate which number is bigger for easier coding
		if (num1 > num2){
			maximum = num1;
			minimum = num2;
		} else if (num1 < num2){
			maximum = num2;
			minimum = num1;
		} else{
			maximum = num1;
			minimum = num2;
		}
		//finish printing out values
		System.out.printf("\nMaximum:    %10d", maximum);
		System.out.printf("\nMinimum:    %10d", minimum);
		System.out.println();
	}
}