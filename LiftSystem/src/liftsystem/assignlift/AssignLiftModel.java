package liftsystem.assignlift;

import liftsystem.Models.TravelPosition;
import liftsystem.database.LiftSystemDB;

public class AssignLiftModel {

	AssignLiftView assignLiftView;

	public AssignLiftModel(AssignLiftView assignLiftView) {
		this.assignLiftView = assignLiftView;
	}

	public boolean assignLift(TravelPosition travelPosition) {
		
		boolean isAssigned = LiftSystemDB.getDBInstance().assignLift(travelPosition);
		return isAssigned;
	}

	public boolean maintances(String liftName) {

		boolean isMaintances = LiftSystemDB.getDBInstance().maintances(liftName);
		return isMaintances;
	}
}
