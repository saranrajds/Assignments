package liftsystem.common;

import java.util.List;

import liftsystem.Models.LiftPosition;

public class CommonView {

	CommonModel commonModel;
	public CommonView() {
		commonModel = new CommonModel(this);
	}
	
	public void getLiftInfo() {
		commonModel.getLiftInfo(); 
	}
	
	public void onSuccessMsg(String message) {
		
		System.out.println("--------------------------");
		System.out.println(message+"\n");	
	}

	public void onAlertMsg(String message) {
		
		System.out.println("-------------------------");
		System.out.println(message+"\n");
	}

	public void displayLiftInfo(List<LiftPosition> liftPositions) {
	
		for(LiftPosition liftPosition: liftPositions) {
			System.out.println("Lift : "+liftPosition.getLift() +" Floor : "+ liftPosition.getFloor());
		}
		System.out.println("-----------------------------\n");
	}
}
