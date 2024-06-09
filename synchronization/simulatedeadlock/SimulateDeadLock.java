package synchronization.simulatedeadlock;

public class SimulateDeadLock {

	public static void main(String[] args) {
	
		ResourceA resourceA = new ResourceA();
        ResourceB resourceB = new ResourceB();
        
        Thread thread1 = new Thread(() -> {
            resourceA.methodA(resourceB);
        }, "Thread1");

        Thread thread2 = new Thread(() -> {
            resourceB.methodB(resourceA);
        }, "Thread2");

        thread1.start();
        thread2.start();
	}
}
