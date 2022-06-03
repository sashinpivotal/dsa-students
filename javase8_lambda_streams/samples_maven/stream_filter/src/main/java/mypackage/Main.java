package mypackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

		// Perform filtering - get numbers that are greater than 5
		Stream<Integer> snumbers = numbers.stream().filter(p -> p > 5);

		// Print out the result
		snumbers.forEach(p -> System.out.print(p + " "));

		// <For your own exercise>
		// - Create list of names with "Peter", "Tom", "Paul", "Sang"
		// - Filter out the names that starts with "P" and display them

	}
	

}