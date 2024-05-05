package multithreading.producerconsumer;

public class Consumer extends Thread {

	private Buffer buffer;

	Consumer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run() {
		try {
			for (int i = 1; i <= 9; i++) {
				buffer.removeItem();
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
