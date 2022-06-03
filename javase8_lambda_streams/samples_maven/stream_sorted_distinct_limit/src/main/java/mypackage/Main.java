package mypackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		System.out.println("---- Perform distinct, sorted, and limit on numbers");
		List<Integer> numbers = Arrays.asList(5, 6, 3, 3, 3, 5, 5, 6, 7, 1);
		Stream<Integer> snumbers = numbers.stream()
				.distinct()
				.sorted()
				.limit(4);
		snumbers.forEach(p -> System.out.print(p + " "));
		
		System.out.println("\n---- Perform distinct, unordered, and limit on numbers");
		snumbers = numbers.stream()
				.distinct()
				.unordered()
				.limit(4);
		snumbers.forEach(p -> System.out.print(p + " "));

		System.out.println("\n---- Perform distinct, sorted, and limit on strings");
		Stream<String> names = Stream.of("apple", "apple", "orange", "cherry", "banana")
				.distinct()
				.sorted()
				.limit(2);
		names.forEach(p -> System.out.print(p + " "));

	}

}