package synchronization.question01;

public class Printer {

	public synchronized void printDocument(String documentName) {
		
		System.out.println(Thread.currentThread().getName() + " is printing document: " + documentName);
		try {
			// Simulate time taken to print
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " has finished printing: " + documentName);
       
	}
}

class PrintTask implements Runnable {
    private Printer printer;
    private String documentName;

    public PrintTask(Printer printer, String documentName) {
        this.printer = printer;
        this.documentName = documentName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            printer.printDocument(documentName + " - Page " + (i + 1));
        }
    }
}