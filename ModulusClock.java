import java.util.Scanner;

public class ModulusClock {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//declare variables
		int givenHour, givenMinutes, addedHour, addedMinutes, newHour, newMinutes;
		final int minutes_in_hour = 60;
		final int hours_loop = 12;
		//asks given hour
		System.out.println("What is the current hour: ");
		givenHour = scan.nextInt();
		//checks to see if given hour is correct
		while (givenHour > hours_loop){
			System.out.println("Not a valid hour!");
			System.out.println("What is the current hour: ");
			givenHour = scan.nextInt();
		}
		//asks given minute(s)
		System.out.println("What is the current minute(s): ");
		givenMinutes = scan.nextInt();
		//checks to see if given minutes is correct
		while (givenMinutes > minutes_in_hour){
			System.out.println("Not a valid number of minutes!");
			System.out.println("What is the current mintute(s): ");
			givenMinutes = scan.nextInt();
		}
		//asks added hour(s)
		System.out.println("What is the added hour(s): ");
		addedHour = scan.nextInt();
		//checks to see if added hour is correct
		while (addedHour > hours_loop){
			System.out.println("Not valid!");
			System.out.println("What is the added hour(s): ");
			addedHour = scan.nextInt();
		}
		//asks added minute(s)
		System.out.println("What is the added minute(s): ");
		addedMinutes = scan.nextInt();
		//checks to see if given minutes is correct
		while (addedMinutes > minutes_in_hour){
			System.out.println("Not  a valid number of minutes!");
			System.out.println("What is the added mintute(s): ");
			addedMinutes = scan.nextInt();
		}
		//calculate new time
		newHour = (givenHour + addedHour) + ((givenMinutes + addedMinutes)/60);
		newMinutes = ((givenMinutes + addedMinutes)%60);
		// Convert zero o'clock to twelve o'clock
		if (newHour == 0){
		  newHour = 12;
		}
		//prints new time!
		System.out.println("New time is: " + newHour + " hours and " + newMinutes + " minute(s)!");
	}

}