
import java.util.Scanner;

public class CedarPointCalc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//declare constants
		final double fallStudentCost = 39.00;
		final double fallChaperoneCost = 39.00;
		final double springStudentCost = 42.00;
		final double springChaperoneCost = 42.00;
		final double schoolBusPrice = 1300.42;
		final double charterBusPrice = 1738.92;
		final int peoplePerSchoolBus = 44;
		final int peoplePerCharterBus = 55;
		final int chaperonePerStudents = 4;
		final int foodAllowance = 25;
		//declare variables
		int numChaperones;
		int numStudents;
		double fallAdmissionCost;
		double springAdmissionCost;
		double schoolBusCost;
		double charterBusCost;
		int foodAllowanceCost;
		double totalCost;
		//ask number of students
		System.out.println("How many students are going?");
		numStudents = scan.nextInt();
		//Calculates and displays number of chaperones based on number of students.
		numChaperones = (int) (numStudents / chaperonePerStudents);
		System.out.printf("\nNumber of chaperones:   %10d", numChaperones);
		//Calculates and displays seasonal admission costs
		fallAdmissionCost = ((numStudents * fallStudentCost) + (numChaperones * fallChaperoneCost));
		springAdmissionCost = ((numStudents * springStudentCost) + (numChaperones * springChaperoneCost));
		System.out.printf("\nFall Admission Cost:    %10.2f", fallAdmissionCost);
		System.out.printf("\nSpring Admission Cost:  %10.2f", springAdmissionCost);
		//Calculates and displays both transportation cost
		schoolBusCost = ((numStudents + numChaperones)/peoplePerSchoolBus) * schoolBusPrice;
		charterBusCost = ((numStudents + numChaperones)/peoplePerCharterBus) * charterBusPrice;
		System.out.printf("\nSchool Bus Cost:        %10.2f", schoolBusCost);
		System.out.printf("\nCharter Bus Cost:       %10.2f", charterBusCost);
		//Calculates and displays food allowance cost
		foodAllowanceCost = (int)(numStudents * foodAllowance);
		System.out.printf("\nFood Allowance Cost:    %10d", foodAllowanceCost);
		//Calculates and displays the total cost
		totalCost = (fallAdmissionCost + schoolBusCost + foodAllowanceCost);
		System.out.printf("\nTotal Cost For The Trip:%10.2f\n", totalCost);
	}
}