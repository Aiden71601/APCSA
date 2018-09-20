import java.util.Scanner;

public class NameGame {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String Name;
		System.out.print("Enter your name: ");
		Name = scan.nextLine();
		//Starts the "game"
		System.out.print("\nHello " + Name + "!");
		System.out.print("\nYour name is " + Name.length() + " letters long.");
		System.out.print("\nYour name starts with a " + Name.charAt(0) + ".");
		System.out.print("\nThe letter " + (Name.charAt(Name.length()/2)) + " is at the center of your name.");
		System.out.print("\nYour name ends with a " + Name.charAt(Name.length()-1));
		System.out.print("\nGoodbye " + Name + "!\n");
	}
}