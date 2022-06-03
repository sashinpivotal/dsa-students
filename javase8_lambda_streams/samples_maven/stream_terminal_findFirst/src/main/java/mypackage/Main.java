package mypackage;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Stream<String> names = Stream.of("Sang", "John", "David", "Mary", "Dadu");

		Optional<String> firstNameWithD = names.filter(i -> i.startsWith("D")).findFirst();
		if (firstNameWithD.isPresent()) {
			System.out.println("First Name starting with D = " + firstNameWithD.get());
		}

		names = Stream.of("Sang", "John", "David", "Mary", "Dadu");

		names.filter(i -> i.startsWith("D"))
				.findAny()
				.ifPresent(thing -> System.out.println("Any Name starting with D = " + thing));

		// <For your own exercise>
		// - From the "names" stream, filter names whose length is greater than 3
		// - Use findFirst() and findAny()

		// <For your own exercise>
		// - Given a list of numbers of 1,2,3,4,5,6,7,8,9 find the first
		//   number whose is greater than 3 and even number and double it
		// - Convert the lambda expression to method references

	}

}