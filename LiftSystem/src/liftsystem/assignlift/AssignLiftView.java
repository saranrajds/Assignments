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
		System.out.println("1 -> Display Lift Position");
		System.out.println("2 -> Assign Lift");
		System.out.println("3 -> Assign Nearest Lift ");
		System.out.println("4 -> Assign Nearest with Direction ");
		System.out.println("5 -> Assign with restriction ");
		System.out.println("6 -> Assign lift with least stops ");
		System.out.println("7 -> Assign with capacity ");
//		System.out.println("8 -> Manual assign capacity ");
		System.out.println("8 -> Maintenance");
		System.out.println("9 -> Exit");
		System.out.print("Enter Your Choice : ");
		
		String choich = s.next();
		
		if(choich.equals("1")) {
			new CommonView().getLiftInfo();
		}
		else if(choich.equals("2")) {
			assignLift();
		}
		else if(choich.equals("3")) {
			assignNearestLift();
		}
		else if(choich.equals("4")) {
			assignNearestwithDirectionLift();
		}
		else if(choich.equals("5") || choich.equals("6")) {
			assignWithRestriction();
		}
		else if(choich.equals("7")) {
			assignwithcapacity();
		}
		else if (choich.equals("8")) 
		{	
			maintances();
		}
		else if (choich.equals("9")) {
			new CommonView().onAlertMsg("\nThank You...");
			return;
		}
		else {
			new CommonView().onAlertMsg("Enter Correct Input");
		}
		
		init();
	}

	public TravelPosition getInput() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("\nEnter the Positino to Travel");
		TravelPosition travelPosition = new TravelPosition();
		System.out.print("Current Floor : ");
		int curPos = s.nextInt();		
		System.out.print("Distination Floor : ");
		int disPos = s.nextInt();
		
		if(curPos >= 0 && curPos <= 10 && disPos >= 0 && disPos <= 10) {
			travelPosition.setCurrentPosition(curPos);
			travelPosition.setDistinationPosition(disPos);
			return travelPosition;
		}
		else {
			new CommonView().onAlertMsg("Position is in-correct..");
			return null;
		}
	}
	
	public void assignLift() {
		
		TravelPosition travelPosition = getInput();
		if(travelPosition != null) {
			boolean isAssign = assignLiftModel.assignLift(travelPosition);
			new CommonView().onAlertMsg("Position Assign successfully");
		}
	}
	
	public void assignNearestLift() {
		
		TravelPosition travelPosition = getInput();
		if(travelPosition != null) {
			boolean isAssign = assignLiftModel.assignNearestLift(travelPosition);
			new CommonView().onAlertMsg("Position Assign successfully");
		}
	}
	
	private void assignNearestwithDirectionLift() {
		
		TravelPosition travelPosition = getInput();
		if(travelPosition != null) {
			boolean isAssign = assignLiftModel.assignNearestwithDirectionLift(travelPosition);
			new CommonView().onAlertMsg("Position Assign successfully");
		}
	}
	
	private void assignWithRestriction() {

		TravelPosition travelPosition = getInput();
		if(travelPosition != null) {
			boolean isAssign = assignLiftModel.assignWithRestriction(travelPosition);
			new CommonView().onAlertMsg("Position Assign successfully");
		}
	}
	
	private void assignwithcapacity() {
		
		TravelPosition travelPosition = getInput();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Capcacity : ");
		int capacity = s.nextInt();
		
		if(travelPosition != null) {
			boolean isAssign = assignLiftModel.assignwithcapacity(travelPosition, capacity);
			new CommonView().onAlertMsg("Position Assign successfully");
		}
	}
	
	private void maintances() {
		
		Scanner s = new Scanner(System.in);
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
}
