package multithreading.producerconsumer;

public class Producer extends Thread {

	private Buffer buffer;

	Producer(Buffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				buffer.addItem(i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
