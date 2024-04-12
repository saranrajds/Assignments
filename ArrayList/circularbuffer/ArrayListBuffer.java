package ArrayList.circularbuffer;

import java.util.ArrayList;

public class ArrayListBuffer {

	ArrayList<String> arrayList;
	int index = 0, capacity = 0;
	
	ArrayListBuffer(int size) {
		this.capacity = size;
		this.arrayList = new ArrayList<String>(capacity);
	}
	
	public void add(String text) {

//		System.out.println("index "+index);
		if(index < capacity) {
			arrayList.add(text);			
		}
		else {
			arrayList.set(index%capacity, text);
		}
		index++;
	}
	
	public void showText() {
		
		System.out.println(arrayList +"\n");
	}
}
