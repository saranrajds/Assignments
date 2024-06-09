package synchronization.waitandnotify;

import java.util.Random;

public class Consumer implements Runnable {
	private Buffer buffer;

	public Consumer(Buffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		Random random = new Random();
		while (true) {
			buffer.get();
			try {
				Thread.sleep(random.nextInt(1000)); // Sleep for a random time
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}
		}
	}
}
