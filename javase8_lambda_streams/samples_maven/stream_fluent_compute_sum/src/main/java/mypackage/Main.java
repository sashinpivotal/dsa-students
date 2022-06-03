package mypackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

	// Non-stream operation (external iteration)
	private static int sumIterator(List<Integer> list) {
		Iterator<Integer> it = list.iterator();
		int sum = 0;
		while (it.hasNext()) {
			int num = it.next();
			if (num > 10) {
				sum += num;
			}
		}
		return sum;
	}

	// Stream operation (internal iteration)
	private static int sumStream(List<Integer> list) {
		return list.stream()
				.filter(i -> i > 10)
				.mapToInt(i -> i)
				.sum();
	}

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(3, 8, 14, 11);

		// Compute sum of numbers that are greater than 10
		System.out.println(sumIterator(list));
		System.out.println(sumStream(list));

		// <For your own exercise>
		// - Create Stream-based method, in which you filter only  
		//   the numbers less than 9 and them compute sum of it
		
	}
	
}
