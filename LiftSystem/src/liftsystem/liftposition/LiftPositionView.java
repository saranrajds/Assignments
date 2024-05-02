package liftsystem.liftposition;

import liftsystem.assignlift.AssignLiftView;
import liftsystem.common.CommonView;

public class LiftPositionView {

	private LiftPositionModel liftPositionModel;
	
	public LiftPositionView() {
		liftPositionModel = new LiftPositionModel(this);
	}
	
	public void init() {
		
		boolean isLoaded = liftPositionModel.loadLiftWithPosition();
		
		if(isLoaded) {
			
			new CommonView().onSuccessMsg("Lift Loaded Successfully...");
			new AssignLiftView().init();
		}
		else {
			new CommonView().onAlertMsg("Lift not Loaded... Try Again...");
			return;
		}
		
	}
}
