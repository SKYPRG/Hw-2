import java.util.Scanner;

public class FlightTicketDemo {
	static Scanner input = new Scanner(System.in);

	static char isValidClassType(char ClassType)

	{
		char classType = ClassType;
		while (classType != 'E' && classType != 'B' && classType != 'F' && classType != 'e' && classType != 'b'
				&& classType != 'f') {
			System.out.println("ERROR: Invalid class type. Must be \'E\' or \'B\' or \'F\'.");
			System.out.print("Enter ticket class:(\'E\',\'B\',\'F\'): ");
			classType = input.next().charAt(0);
		}
		return classType;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String passengerName = null;
		char classType = '\u0000';
		int daysBeforeFlight = 0;
		while (true) {
			System.out.print("Enter passenger name(or \'exit\' to quit): ");
			passengerName = input.next();
			if (passengerName.equalsIgnoreCase("exit")) {
				System.out.print("Goodbye!");
				System.exit(0);
			} else {
				System.out.print("Enter ticket class:(\'E\',\'B\',\'F\'): ");
				classType = input.next().charAt(0);
				classType = isValidClassType(classType);

				System.out.print("Enter days before Flight: ");
				daysBeforeFlight = input.nextInt();
				FlightTicket p = new FlightTicket(passengerName, classType, daysBeforeFlight);
				System.out.println(p);
				System.out.println("=====================");

			}

		}
	}
}
