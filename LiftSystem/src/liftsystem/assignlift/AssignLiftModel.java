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
	
	public boolean assignNearestLift(TravelPosition travelPosition) {
		
		boolean isAssigned = LiftSystemDB.getDBInstance().assignNearestLift(travelPosition);
		return isAssigned;
	}
	
	public boolean assignNearestwithDirectionLift(TravelPosition travelPosition) {
		
		boolean isAssigned = LiftSystemDB.getDBInstance().assignNearestwithDirectionLift(travelPosition);
		return isAssigned;
	}

	public boolean maintances(String liftName) {

		boolean isMaintances = LiftSystemDB.getDBInstance().maintances(liftName);
		return isMaintances;
	}

	public boolean assignWithRestriction(TravelPosition travelPosition) {

		boolean isAssigned = LiftSystemDB.getDBInstance().assignWithRestriction(travelPosition);
		return isAssigned;
	}

	public boolean assignwithcapacity(TravelPosition travelPosition, int capacity) {

		boolean isAssigned = LiftSystemDB.getDBInstance().assignwithcapacity(travelPosition, capacity);
		return isAssigned;
	}
}
