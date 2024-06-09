package synchronization.waitandnotify;

public class Buffer {
	private Integer value = null;

	public synchronized void put(int value) {
		while (this.value != null) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}
		}
		this.value = value;
		System.out.println("Produced: " + value);
		notifyAll();
	}

	public synchronized int get() {
		while (this.value == null) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}
		}
		int returnValue = this.value;
		this.value = null;
		System.out.println("Consumed: " + returnValue);
		notifyAll();
		return returnValue;
	}
}
