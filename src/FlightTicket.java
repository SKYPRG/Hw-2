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
		if (classType == 'E')
			twoLettersClassType = "EC";
		else if (classType == 'B')
			twoLettersClassType = "BU";
		else if (classType == 'F')
			twoLettersClassType = "FI";
		return twoLettersClassType + (passengerName.substring(passengerName.length() - 2).toUpperCase()) + numOfTickets;

	}

	public double calculateTicketPrice() {
		double TicketPrice = 0.0;
		if (classType == 'E')
			TicketPrice = (850 + (daysBeforeFlight * 10));
		else if (classType == 'B')
			TicketPrice = (1500 + (daysBeforeFlight * 15));
		else if (classType == 'F')
			TicketPrice = (2500 + (daysBeforeFlight * 20));
		return TicketPrice;
	}

	public String toString() {
		return "Passenger: " + passengerName + ", ID: " + ticketID + ", Class: " + classType + ", Days Before Flight: "
				+ daysBeforeFlight + ", Total: " + calculateTicketPrice() + "SAR";
	}
}
