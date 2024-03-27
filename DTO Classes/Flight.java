package dtoclasswithattributes;

public class Flight {

	private String flightName;
	private String flightNo;
	private String arrival;
	private String departure;
	private double ticketPrice;
	private int numberOfPerson;
	private int numberofSeats;
	private boolean status;
	private static String airlines;

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getNumberOfPerson() {
		return numberOfPerson;
	}

	public void setNumberOfPerson(int numberOfPerson) {
		this.numberOfPerson = numberOfPerson;
	}

	public int getNumberofSeats() {
		return numberofSeats;
	}

	public void setNumberofSeats(int numberofSeats) {
		this.numberofSeats = numberofSeats;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public static String getAirlines() {
		return airlines;
	}

	public static void setAirlines(String airlines) {
		Flight.airlines = airlines;
	}

	public void displayFlightDetails() {
		
		System.out.println("FlightName "+flightName);
		System.out.println("FlightNo "+flightNo);
		System.out.println("Arrival "+arrival);
		System.out.println("Departure "+departure);
		System.out.println("TicketPrice "+ticketPrice);
		System.out.println("Status "+status);
		System.out.println("Number Of Seats"+numberofSeats);
		System.out.println("Number Of Person "+numberOfPerson);
	}
}
