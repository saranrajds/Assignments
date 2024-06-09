package synchronization.simulatedeadlock;

public class ResourceA {

	public synchronized void methodA(ResourceB resourceB) {
		
		System.out.println(Thread.currentThread().getName() + " locked ResourceA");
		
		try {
			Thread.sleep(50); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " trying to lock ResourceB");
		
		synchronized (resourceB) {
			System.out.println(Thread.currentThread().getName() + " locked ResourceB");
		}
	}
}
