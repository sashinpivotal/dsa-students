package mypackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		int max = 5000000;
		int threashold = 50000;

		Date d1, d2;
		long elapsed_time;

		// Create test data
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < max; i++)
			numbers.add(i);

		d1 = new Date();

		// Perform sequential filtering
		numbers.stream()
				.filter(p -> p > threashold)
				.mapToInt(i -> i)
				.sum();

		d2 = new Date();
		elapsed_time = d2.getTime() - d1.getTime();
		System.out.println("Using sequential stream took " + elapsed_time + " milliseconds");

		d1 = new Date();

		// Perform parallelStream
		numbers.parallelStream()
				.filter(p -> p > threashold)
				.mapToInt(i -> i)
				.sum();

		d2 = new Date();
		elapsed_time = d2.getTime() - d1.getTime();
		System.out.println("Using parallel stream took " + elapsed_time + " milliseconds");

		// <For your own exercise>
		// - Create test data with random numbers (instead of sequential numbers)
		// - Use sorted

	}

}