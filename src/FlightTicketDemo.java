import java.util.Scanner;

public class FlightTicketDemo {
	static Scanner input = new Scanner(System.in);

	static char isValidClassType(char ClassType)

	{
		char classType = ClassType;
		while (classType != 'E' && classType != 'B' && classType != 'F' && classType != 'e' && classType != 'b'
				&& classType != 'f') { // if classtype isn't listed, then user won't leave until he enters a correct
										// class type
			System.out.println("ERROR: Invalid class type. Must be \'E\' or \'B\' or \'F\'.");
			System.out.print("Enter ticket class:(\'E\',\'B\',\'F\'): ");
			classType = input.next().charAt(0);
		}
		return classType;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String passengerName = null;
		char classType = '\u0000'; // default char value
		int daysBeforeFlight = 0; // default int valute
		while (true) {
			System.out.print("Enter passenger name(or \'exit\' to quit): ");
			passengerName = input.next(); // enters passenger name
			if (passengerName.equalsIgnoreCase("exit")) { // if passenger name is exit, the program will stop
				System.out.print("Goodbye!");
				System.exit(0);
			} else {
				System.out.print("Enter ticket class:(\'E\',\'B\',\'F\'): ");
				classType = input.next().charAt(0); // entering class type
				classType = isValidClassType(classType); // checks if classtype is valid

				System.out.print("Enter days before Flight: ");
				daysBeforeFlight = input.nextInt();
				FlightTicket p = new FlightTicket(passengerName, classType, daysBeforeFlight); // creates object p with
																								// info of passenger
				System.out.println(p); // prints the info of passenger
				System.out.println("=====================");

			}

		}
	}
}
