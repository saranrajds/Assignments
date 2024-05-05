package multithreading.producerconsumer;

import java.util.LinkedList;
import java.util.List;

public class Buffer {
	
	private List<Integer> buffer = new LinkedList<>();
	private int capacity;

	 Buffer(int capacity) {
		this.capacity = capacity;
	}
	 
	public void addItem(int item) throws InterruptedException {
		synchronized (this) {
			while (buffer.size() == capacity) {
				wait();
			}
			buffer.add(item);
			System.out.println("Item:" + item + " Added");
			notify();
		}
	}

	public void removeItem() throws InterruptedException {
		synchronized (this) {
			while (buffer.isEmpty()) {
				wait();
			}
			int item = buffer.size() > 0 ? buffer.remove(0) : 0;
			System.out.println("Item:" + item + " Removed");
			notify();
		}
	}
}
