package liftsystem.assignlift;

import java.util.Scanner;

import liftsystem.Models.TravelPosition;
import liftsystem.common.CommonView;

public class AssignLiftView {

	AssignLiftModel assignLiftModel;

	public AssignLiftView() {
		this.assignLiftModel = new AssignLiftModel(this);
	}

	public void init() {

		new CommonView().getLiftInfo();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Select Option : ");
		System.out.println("1 -> Use Lift");
		System.out.println("2 -> Maintenance");
		System.out.println("3 -> Exit");
		System.out.print("Enter Your Choice : ");
		
		String choich = s.next();
		
		if(choich.equals("1")) {
			
			System.out.println("\nEnter the Positino to Travel");
			TravelPosition travelPosition = new TravelPosition();
			System.out.print("Current Floor : ");
			int curPos = s.nextInt();		
			System.out.print("Distination Floor : ");
			int disPos = s.nextInt();
			
			if(curPos >= 0 && curPos <= 10 && disPos >= 0 && disPos <= 10) {
				travelPosition.setCurrentPosition(curPos);
				travelPosition.setDistinationPosition(disPos);
				boolean isAssign = assignLiftModel.assignLift(travelPosition);
				new CommonView().onAlertMsg("Position Assign successfully");
			}
			else {
				new CommonView().onAlertMsg("Position is in-correct..");
			}
		}
		else if (choich.equals("2")) {
			System.out.println("\nEnter Left Name : ");
			String liftName = s.next();

			boolean isAssign = assignLiftModel.maintances(liftName);
			if(isAssign) {
				new CommonView().onSuccessMsg(liftName + " Life Set to Maintance");
			}
			else {
				new CommonView().onAlertMsg(liftName +" Lift is not Present.");
			}
		}
		else if (choich.equals("3")) {
			return;
		}
		else {
			System.out.println("Enter Correct Input");;
		}
		
		init();
	
	}
}
