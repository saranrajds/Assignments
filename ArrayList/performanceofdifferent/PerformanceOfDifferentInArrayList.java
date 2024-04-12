package ArrayList.performanceofdifferent;

import java.util.ArrayList;
import java.util.Random;

public class PerformanceOfDifferentInArrayList {

	public static void main(String[] args) {

		getPerformance();
	}

	private static void getPerformance() {

		int capacity = 10000000;
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>(capacity);

		for (int i = 0; i < capacity; i++) {

			list1.add(i + 1);
			list2.add(i + 1);
		}

		System.out.println("Random Access");
		long startTime = System.nanoTime();
		Random random = new Random();
		for (int i = 0; i < capacity; i++) {
			int index = random.nextInt(capacity);
			int element = list1.get(index);
		}

		long endTime = System.nanoTime();
		double minutes = getTime(endTime, startTime);
		System.out.println("Time for random access: " + minutes);

		System.out.println("\nSequential Access");
		startTime = System.nanoTime();
		for (int i = 0; i < capacity; i++) {
			int element = list2.get(i);
		}
		endTime = System.nanoTime();
		minutes = getTime(endTime, startTime);
		System.out.println("Time for sequential access: " + minutes);

	}

	private static double getTime(long endTime, long startTime) {

		long randomAccessTime = endTime - startTime;
		double minutes = (randomAccessTime / 1_000_000_000.0) / 60.0;
		double roundedMinutes = Math.round(minutes * 100.0) / 100.0;
		return roundedMinutes;
	}
}
