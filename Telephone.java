
import java.util.Scanner;

public class Telephone {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//Declare all parts of the string
		String TenDigitNumber;
		String AreaCode;
		String ThreeDigits;
		String LastFourDigits;
		String TelephoneNumber;
		//User inputs digits, code formats it into a phone number
		System.out.print("Gimme ten digits: ");
		TenDigitNumber = scan.nextLine();
		AreaCode = ("(" + TenDigitNumber.substring(0,3) + ")");
		ThreeDigits = ("-" + TenDigitNumber.substring(3,6) + "-");
		LastFourDigits = TenDigitNumber.substring(6,10);
		TelephoneNumber = AreaCode + ThreeDigits + LastFourDigits;
		System.out.println("Phone number is: " + TelephoneNumber);
	}
}