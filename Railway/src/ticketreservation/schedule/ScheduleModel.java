package ticketreservation.schedule;

import java.util.ArrayList;
import java.util.Scanner;

import ticketreservation.dbcontext.DBContext;
import ticketreservation.model.Train;

public class ScheduleModel {

	private ScheduleView scheduleView;
	
	public ScheduleModel(ScheduleView scheduleView) {
		this.scheduleView = scheduleView;
	}

	public boolean addTrain(Train train) {
		boolean isTrainAdded = DBContext.getInstance().addTrain(train);
		scheduleView.showMessage("Train Added Successfully");
		return false;
	}

	public void isTrainAvaiable(String trarinId) {
		
		if(!DBContext.getInstance().isTrainAvaiable(trarinId)) {
			scheduleView.showMessage("Train Is Not Available for This "+trarinId +" Number");
		}
		else {
			scheduleView.getTrainInputFromUser(trarinId);
		}
		
	}

	public void addTrainSchedule(Train train) {
		
		if(DBContext.getInstance().addTrainSchedule(train)) {
			scheduleView.showMessage(train.getNumber() +" Train Schedule Updated Succesfully");
		}
		else {
			scheduleView.showMessage(train.getNumber() +" Train Schedule Not Updated");
		}
	}

	public void getTrainFullInfo() {
		
		ArrayList<Train> trains = DBContext.getInstance().getTrainFullInfo();
		if(trains.size() > 0) {
			scheduleView.displayTrainInfo(trains);
		}
		else {
			scheduleView.showMessage("\nNot Train are avaiable\n");
		}
	}

}
