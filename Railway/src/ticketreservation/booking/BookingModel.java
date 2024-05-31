package ticketreservation.booking;

import java.util.List;

import ticketreservation.dbcontext.DBContext;
import ticketreservation.model.Train;

public class BookingModel {

	private BookingView bookingView;
	
	public BookingModel(BookingView bookingView) {
		this.bookingView = bookingView;
	}

	public void getAvalableTrains(String fromStation, String toStation) {

		List<Train> trains = DBContext.getInstance().getAvalableTrains(fromStation, toStation);
		if(trains.size() > 0) {
			bookingView.showAvaiableTrains(trains);
		}
		else {
			bookingView.showMessage("No Train Avaiable");
		}
	}

}
