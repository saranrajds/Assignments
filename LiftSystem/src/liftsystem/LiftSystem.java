package liftsystem;

import liftsystem.liftposition.LiftPositionView;

public class LiftSystem {

	private static LiftSystem liftsystem;
	
	private static LiftSystem getInstance() {
		
		if(liftsystem == null)
			liftsystem = new LiftSystem();
		
		return liftsystem;
	}
	
	private void init() {
		
		System.out.println("Lift System Management\n");
		new LiftPositionView().init();
	}
	
	public static void main(String[] args) {

//		System.out.println("welcome");
		liftsystem.getInstance().init();		
	}
}
