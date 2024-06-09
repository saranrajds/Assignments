package synchronization.waitandnotify;

public class WaitandNotifyToSynchronize {

	public static void main(String[] args) {

		Buffer buffer = new Buffer();
        
        Thread producer1 = new Thread(new Producer(buffer), "Producer1");
        Thread producer2 = new Thread(new Producer(buffer), "Producer2");
        Thread consumer1 = new Thread(new Consumer(buffer), "Consumer1");
        Thread consumer2 = new Thread(new Consumer(buffer), "Consumer2");

        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();
	}
}
