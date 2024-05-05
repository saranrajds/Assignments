package liftsystem.database;

import java.util.ArrayList;
import java.util.List;

import liftsystem.Models.LiftPosition;
import liftsystem.Models.TravelPosition;

public class LiftSystemDB {

	private final int NUMBER_OF_LIFTS = 5, LIFT_CAPACITY = 5;
	public static LiftSystemDB liftSystemDB;
	private List<LiftPosition> liftPositions = new ArrayList<LiftPosition>();
	private int getCapacity = 0;
	private List<Integer> indexForCptyMonitor = new ArrayList<Integer>();
	private boolean isFromCapacityOption = false;

	public static LiftSystemDB getDBInstance() {

		if (liftSystemDB == null)
			liftSystemDB = new LiftSystemDB();

		return liftSystemDB;
	}

	public boolean loadLiftWithPosition() {

		for (int i = 1; i <= NUMBER_OF_LIFTS; i++) {

			LiftPosition liftPosition = new LiftPosition();
			liftPosition.setLift("L" + i);
			liftPosition.setFloor(0);
			liftPosition.setCapacity(LIFT_CAPACITY);

			if (i < 2) {
				liftPosition.setStartPosition(1);
				liftPosition.setEndPosition(5);
			} else if (i < 4) {
				liftPosition.setStartPosition(6);
				liftPosition.setEndPosition(10);
			} else {
				liftPosition.setStartPosition(1);
				liftPosition.setEndPosition(10);
			}

			liftPositions.add(liftPosition);
		}

		return liftPositions.size() == NUMBER_OF_LIFTS;
	}

	public boolean assignLift(TravelPosition travelPosition) {

		liftPositions.get(0).setFloor(travelPosition.getDistinationPosition());
		return true;
	}

	public boolean assignNearestLift(TravelPosition travelPosition) {

		int index = getMinIndexInRenge(0, liftPositions.size(), travelPosition, false);
		liftPositions.get(index).setFloor(travelPosition.getDistinationPosition());
		return true;
	}

	public List<LiftPosition> getLiftInfo() {

		return liftPositions;
	}

	public boolean assignNearestwithDirectionLift(TravelPosition travelPosition) {

		if (travelPosition.getCurrentPosition() >= travelPosition.getDistinationPosition()) {
			int index = -1;
			int tempPosition = travelPosition.getDistinationPosition();
			int position = tempPosition < 5 ? tempPosition - 1 : 4;
			for (int i = position; i >= 0; i--) {

				int temp = liftPositions.get(i).getFloor();
				if (temp >= travelPosition.getCurrentPosition() && liftPositions.get(i).getFloor() != -1) {
					index = i;
					break;
				}
			}

			if (index == -1) {
				for (int i = 4; i >= position; i--) {

					int temp = liftPositions.get(i).getFloor();
					if (temp >= travelPosition.getCurrentPosition() && liftPositions.get(i).getFloor() != -1) {
						index = i;
						break;
					}
				}
			}

			index = index == -1 ? 0 : index;
			liftPositions.get(index).setFloor(travelPosition.getDistinationPosition());
		} else {
			assignNearestLift(travelPosition);
		}

		return true;

	}

	public boolean maintances(String liftName) {

		for (LiftPosition liftPosition : liftPositions) {

			if (liftPosition.getLift().equals(liftName)) {
				liftPosition.setFloor(-1);
				return true;
			}
		}
		return false;
	}

	public boolean assignWithRestriction(TravelPosition travelPosition) {

//		int index = getMinIndex(travelPosition);

		int cp = travelPosition.getCurrentPosition(), dp = travelPosition.getDistinationPosition();
		int index = 0;
		if (cp >= 0 && cp <= 5 && dp >= 0 && dp <= 5) {
			System.out.println("1");
			index = getMinIndexInRenge(0, 2, travelPosition, true);
		} else if ((cp == 0 || cp >= 6 && cp <= 10) && (dp == 0 || dp >= 6 && dp <= 10)) {
			System.out.println("2");
			index = getMinIndexInRenge(2, 4, travelPosition, true);
		} else {
			index = liftPositions.size() - 1;// getMinIndexInRenge(5, 6, travelPosition, true);
			System.out.println("3");
		}

		getCapacity = liftPositions.get(index).getCapacity();
		liftPositions.get(index).setFloor(travelPosition.getDistinationPosition());
		return true;
	}

	private int getMinIndexInRenge(int cp, int dp, TravelPosition travelPosition, boolean isFromRange) {

		int index = -1, min = Integer.MAX_VALUE, curp = travelPosition.getCurrentPosition(), i = cp, end = dp;

		if (!isFromRange) {
			index = 0;
		}

		for (; i < liftPositions.size(); i++) {

			int temp = Math.abs(curp - liftPositions.get(i).getFloor());
			if (min > temp && liftPositions.get(i).getFloor() != -1
					&& (!isFromCapacityOption || !indexForCptyMonitor.contains(i))) {
				index = i;
				min = temp;
				indexForCptyMonitor.add(i);
			}
		}

		return index;
	}

	public boolean assignwithcapacity(TravelPosition travelPosition, int capacity) {

		int temp = capacity;
		isFromCapacityOption = true;

		while (temp > 0) {
//			System.out.println("temp "+ temp+", "+getCapacity);
			assignWithRestriction(travelPosition);
			temp = temp > getCapacity ? temp - getCapacity : -1;
		}

		isFromCapacityOption = false;
		return true;
	}
}
