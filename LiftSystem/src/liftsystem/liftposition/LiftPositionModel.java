package liftsystem.liftposition;

import liftsystem.database.LiftSystemDB;

public class LiftPositionModel {

	private LiftPositionView liftPositionView;
	
	public LiftPositionModel(LiftPositionView liftPositionView) {
		
		this.liftPositionView = liftPositionView;
	}

	public boolean loadLiftWithPosition() {

		boolean isLoaded = new LiftSystemDB().getDBInstance().loadLiftWithPosition();
		return isLoaded;
	}

}
