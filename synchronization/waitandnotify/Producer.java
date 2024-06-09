package synchronization.waitandnotify;

import java.util.Random;

public class Producer implements Runnable {
	private Buffer buffer;

	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		Random random = new Random();
		while (true) {
			int value = random.nextInt(100); // Produce a random value
			buffer.put(value);
			try {
				Thread.sleep(random.nextInt(1000)); // Sleep for a random time
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}
		}
	}
}
