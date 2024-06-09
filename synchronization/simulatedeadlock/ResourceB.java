package synchronization.simulatedeadlock;

public class ResourceB {
	
	public synchronized void methodB(ResourceA resourceA) {
        
		System.out.println(Thread.currentThread().getName() + " locked ResourceB");
        
        try {
        	Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println(Thread.currentThread().getName() + " trying to lock ResourceA");
       
        synchronized (resourceA) {
            System.out.println(Thread.currentThread().getName() + " locked ResourceA");
        }
   }
}
