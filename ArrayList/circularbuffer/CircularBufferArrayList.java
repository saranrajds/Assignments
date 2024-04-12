package ArrayList.circularbuffer;

public class CircularBufferArrayList {

	public static void main(String[] args) {

		bufferInit();
	}

	private static void bufferInit() {
		
		ArrayListBuffer arrayListBuffer = new ArrayListBuffer(3);
		arrayListBuffer.add("1");
		arrayListBuffer.showText();
		arrayListBuffer.add("2");
		arrayListBuffer.add("3");
		arrayListBuffer.add("4");
		arrayListBuffer.add("5");
		arrayListBuffer.showText();
		arrayListBuffer.add("6");
		arrayListBuffer.showText();
		
	}
}
