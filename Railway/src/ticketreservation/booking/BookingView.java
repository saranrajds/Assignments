package ticketreservation.booking;

import java.util.List;
import java.util.Scanner;

import ticketreservation.model.Train;

public class BookingView {

	private BookingModel bookingModel;
	
	public BookingView() {
		bookingModel = new BookingModel(this);
	}
	
	public void bookingInit() {
		showBookingOptions();
	}

	private void showBookingOptions() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("1 -> Booking");
		System.out.println("2 -> Get PNR Status");
		System.out.println("3 -> Booked Ticket");
		System.out.println("4 -> Cancel Ticket");
		System.out.println("5 -> Search Ticket");
		System.out.println("6 -> Change Ticket Status");
		System.out.println("7 -> List Train Route");
		System.out.println("8 -> Add Train Route");
		
		System.out.print("Enter Your Choice");
		char choice = s.next().charAt(0);
		
		switch (choice) {
		case '1':
			System.out.println("\n## Plan My Journey ##\n");
			bookTicket();
			break;

		default:
			System.out.println("Please Enter Correct Choice\n");
			break;
		}
	}

	private void bookTicket() {
		
		Scanner s = new Scanner(System.in);
		System.out.print("From Station");
		String fromStation = s.next();
		System.out.print("To Station");
		String toStation = s.next();
		showAvaiableTrains(fromStation, toStation);
	}

	private void showAvaiableTrains(String fromStation, String toStation) {
		bookingModel.getAvalableTrains(fromStation, toStation);
	}

	public void showAvaiableTrains(List<Train> trains) {		
		System.out.println("Train Name \t Ticket Amount");
		for(Train train:trains) {
			System.out.println(train.getName()+"\t"+train.getFare());
		}
	}

	public void showMessage(String msg) {
		System.out.println(msg);
	}
}
