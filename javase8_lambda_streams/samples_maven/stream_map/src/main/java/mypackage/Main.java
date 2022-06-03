package mypackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		System.out.println("---- Perform filtering and then mapping on numbers");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		Stream<Integer> snumbers = numbers.stream()
				.filter(p -> p > 5)
				.map(n -> n + 100);
		snumbers.forEach(p -> System.out.print(p + " "));

		System.out.println("\n---- Perform mapping on strings");
		Stream.of("apple", "Orange", "Cherry")
				.map(String::toUpperCase)
				.forEach(p -> System.out.print(p + " "));

		// <For your own exercise>
		// - From the list of  {"apple", "Orange", "Cherry"}, create a Stream<String> that 
		//   contains fragment of the names from the 2nd character to the 4th character, 
		//   for example, {"ppl", "ran", "her"}

	}

}