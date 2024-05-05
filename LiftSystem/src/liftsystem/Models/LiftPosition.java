package liftsystem.Models;

public class LiftPosition {

	private String lift;
	private int floor;
	private int startPosition;
	private int endPosition;
	private int capacity;
		
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capasity) {
		this.capacity = capasity;
	}

	public int getStartPosition() {
		return startPosition;
	}

	public void setStartPosition(int startPosition) {
		this.startPosition = startPosition;
	}

	public int getEndPosition() {
		return endPosition;
	}

	public void setEndPosition(int endPosition) {
		this.endPosition = endPosition;
	}

	public String getLift() {
		return lift;
	}

	public void setLift(String lift) {
		this.lift = lift;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}
}
