package liftsystem.common;

import java.util.ArrayList;
import java.util.List;

import liftsystem.Models.LiftPosition;
import liftsystem.database.LiftSystemDB;

public class CommonModel {

	CommonView commonView;
	public CommonModel(CommonView commonView) {
		this.commonView = commonView;
	}
	
	public void getLiftInfo() {
		
		List<LiftPosition> liftPositions =  LiftSystemDB.getDBInstance().getLiftInfo();
		commonView.displayLiftInfo(liftPositions);
	}
}
