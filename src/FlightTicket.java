public class FlightTicket {
	private static int numOfTickets; // the total number of created tickets
	private String passengerName; // the name of the passenger
	private String ticketID; // a unique Id for each ticket
	private char classType; // 3 types of tickets: 'E','B','F'.
	private int daysBeforeFlight; // The number of days remaining before the flight.

	public FlightTicket(String passengerName, char classType, int daysBeforeFlight) {
		this.passengerName = passengerName;
		this.classType = classType;
		this.daysBeforeFlight = daysBeforeFlight;
		ticketID = generateTicketID();
		numOfTickets++;

	}

	private String generateTicketID() {
		String twoLettersClassType = null;
		if (classType == 'E' || classType == 'e')
			twoLettersClassType = "EC";
		else if (classType == 'B' || classType == 'b')
			twoLettersClassType = "BU";
		else if (classType == 'F' || classType == 'f')
			twoLettersClassType = "FI";
		if (passengerName.length() >= 2)
			return twoLettersClassType + (passengerName.substring(passengerName.length() - 2).toUpperCase())
					+ numOfTickets;
		else
			return twoLettersClassType + (passengerName.toUpperCase()) + numOfTickets;

	}

	public double calculateTicketPrice() {
		double TicketPrice = 0.0;
		if (classType == 'E' || classType == 'e')
			TicketPrice = (850 + (daysBeforeFlight * 10));
		else if (classType == 'B' || classType == 'b')
			TicketPrice = (1500 + (daysBeforeFlight * 15));
		else if (classType == 'F' || classType == 'f')
			TicketPrice = (2500 + (daysBeforeFlight * 20));
		return TicketPrice;
	}

	public String toString() {
		return String.format("Passenger: %s, ID: %s, Class: %c, Days Before Flight: %d, Total: %.2f SAR", passengerName,
				ticketID, Character.toUpperCase(classType), daysBeforeFlight, calculateTicketPrice());
	}
}
