package ticketreservation.dbcontext;

import java.util.ArrayList;
import java.util.List;

import ticketreservation.model.Train;

public class DBContext {

	ArrayList<Train> trainList = new ArrayList<Train>();
	private static DBContext dbContext;
	
	public static DBContext getInstance() {
		
		if(dbContext == null)
			dbContext = new DBContext();
		
		return dbContext;
	}

	public boolean addTrain(Train train) {
		
		trainList.add(train);
		System.out.println(train);
		return true;
	}

	public boolean isTrainAvaiable(String trarinId) {
		
		for(Train train_ :trainList) {
			
			if(train_.getNumber().equals(trarinId)) {
				return true;
			}
		}

		return false;
	}

	public boolean addTrainSchedule(Train train) {

		for(Train train_ :trainList) {
			
			if(train_.getNumber().equals(train.getNumber())) {
//				train_ = train;
				train_.setFromStation(train.getFromStation());
				train_.setDepartureTime(train.getToStatison());
				train_.setArrivalTime(train.getArrivalTime());
				train_.setDepartureTime(train.getDepartureTime());
				train_.setFare(train.getFare());
				train_.setRoutes(train.getRoutes());
				return true;
			}
		}		
		return false;
	}

	public ArrayList<Train> getTrainFullInfo() {
		
		return trainList;
	}

	public List<Train> getAvalableTrains(String fromStation, String toStation) {

		List<Train> trains = new ArrayList<Train>();
		
		for(Train train_ :trainList) {
			
			if(train_.getFromStation().equals(fromStation)) {
				
				if(train_.getToStatison().equals(toStation)) {
					trains.add(train_);
				}
				else {
					for(String route: train_.getRoutes()) {
						
						if(route.equals(toStation)) {
							trains.add(train_);
							break;
						}
					}
				}
			}
		}
		
		return trains;
	}

	
	

}
