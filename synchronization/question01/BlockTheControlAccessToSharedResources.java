package synchronization.question01;

public class BlockTheControlAccessToSharedResources {

	public static void main(String[] args) {
					
		Printer printer = new Printer();
		
		PrintTask printTask1 = new PrintTask(printer, "Document1");
		PrintTask printTask2 = new PrintTask(printer, "Document2");
		
        Thread thread1 = new Thread(printTask1, "Thread1");
        Thread thread2 = new Thread(printTask2, "Thread2");
       
        thread1.start();
        thread2.start();

	}
	
}
