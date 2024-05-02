package liftsystem.database;

import java.util.ArrayList;
import java.util.List;

import liftsystem.Models.LiftPosition;
import liftsystem.Models.TravelPosition;

public class LiftSystemDB {

	private final int NUMBER_OF_LIFTS = 5;
	public static LiftSystemDB liftSystemDB;
	private List<LiftPosition> liftPositions = new ArrayList<LiftPosition>();
	
	public static LiftSystemDB getDBInstance() {
		
		if(liftSystemDB == null) 
			liftSystemDB = new LiftSystemDB();
		
		return liftSystemDB;		
	}

	public boolean loadLiftWithPosition() {
		
		for (int i = 1; i <= NUMBER_OF_LIFTS; i++) {
			
			LiftPosition liftPosition = new LiftPosition();
			liftPosition.setLift("L"+i);
			liftPosition.setFloor(0);
			liftPositions.add(liftPosition);
		}
		
		return liftPositions.size() == NUMBER_OF_LIFTS;
	}

	public boolean assignLift(TravelPosition travelPosition) {
		
		if(travelPosition.getCurrentPosition() < travelPosition.getDistinationPosition()) {
			int index = 0, min = Integer.MAX_VALUE, curp = travelPosition.getCurrentPosition();
			
			for (int i = 0; i < liftPositions.size(); i++) {
				
				int temp = Math.abs(curp - liftPositions.get(i).getFloor()); 
				if(min > temp && liftPositions.get(i).getFloor() != -1) {
					index = i;
					min = temp;
				}
			}
			liftPositions.get(index).setFloor(travelPosition.getDistinationPosition());
			
		}
		else {
			
			int index = -1;
			int tempPosition = travelPosition.getDistinationPosition();
			int position = tempPosition < 5 ? tempPosition-1 : 4;
			for (int i = position; i >= 0; i--) {
				
				int temp = liftPositions.get(i).getFloor();
				if(temp >= travelPosition.getCurrentPosition() && liftPositions.get(i).getFloor() != -1)
				{
					index = i;
					break;
				}	
			}
			
			if(index == -1) {
				for (int i = 4; i >= position; i--) {
					
					int temp = liftPositions.get(i).getFloor();
					if(temp >= travelPosition.getCurrentPosition() && liftPositions.get(i).getFloor() != -1)
					{
						index = i;
						break;
					}	
				}
			}
			
			index = index == -1 ? 0 : index;
			liftPositions.get(index).setFloor(travelPosition.getDistinationPosition());
			
		}	
		
		return true;
	}
	
	public List<LiftPosition> getLiftInfo() {
		
		return liftPositions;
	}

	public boolean maintances(String liftName) {

		for(LiftPosition liftPosition :liftPositions) {
			
			if(liftPosition.getLift().equals(liftName))
			{
				liftPosition.setFloor(-1);
				return true;
			}
		}
		return false;
	}
}
