package mypackage;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// Create test data
		Person[] personArray = { new Person("Jong", 5), new Person("Jon", 12),
				new Person("Mary", 13) };
		List<Person> people = Arrays.asList(personArray);
		
		Fruit[] fruitArray = { new Fruit("Apple", 11), new Fruit("Orange", 22),
				new Fruit("Banana", 33) };
		List<Fruit> fruits = Arrays.asList(fruitArray);

		// #1: call methods which embeds conversion code in a for loop
		convertPeopleUppercase(people);
		displayResult("---->#1a: ", people);

		convertPeopleLowercase(people);
		displayResult("---->#1b: ", people);

		// #2: call methods which use Function with specific type

		// #3: call methods which use Function with generic type

		// #4: Use a stream (optional exercise since we
		//     have not learned streams yet)
		
		// #5: If you think about, it might be better to use
		//     Consumer rather than Function in this example.
		//     Change it to use Consumer.
		
	}
	

	// #1: Embed conversion code in a for loop
	public static void convertPeopleUppercase(List<Person> people) {
		for (Person p : people) {
			p.setName(p.getName().toUpperCase());
		}
	}

	public static void convertPeopleLowercase(List<Person> people) {
		for (Person p : people) {
			p.setName(p.getName().toLowerCase());
		}
	}

	// Utility method to display list of items
	public static <T> void displayResult(String prefix, List<T> results) {
		System.out.print(prefix);
		results.forEach(item -> System.out.print(item + " "));
		System.out.println();
	}

}