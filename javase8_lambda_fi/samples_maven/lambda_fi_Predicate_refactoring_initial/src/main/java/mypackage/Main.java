package mypackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {

		// Create test data
		Person[] personArray = { new Person("Jong", 5),
				new Person("Jon", 12),
				new Person("Jon", 17),
				new Person("Mary", 13) };
		List<Person> people = Arrays.asList(personArray);

		Fruit[] fruitArray = { new Fruit("Apple", 11),
				new Fruit("Orange", 22),
				new Fruit("Banana", 33) };
		List<Fruit> fruits = Arrays.asList(fruitArray);

		// #1: call methods which embeds test code in a for loop
		List<Person> peopleResult = findPeopleByName(people, "Jon");
		displayResult("---->#1a: ", peopleResult);

		// <For your own exercise>
		// - Write code to find people whose age is greater than 10
		// - Observe that you have to write new method each time
		//   you need to perform find operation with new criteria
		List<Person> peopleResult2 = findPeopleByAge(people, 10);
		displayResult("---->#1b: ", peopleResult2);

		// <For your own exercise>
		// #2: call methods which use Predicate with specific type,
		//   for example, Predicate<Person> or Predicate<Fruit>

		// <For your own exercise>
		// #3: call methods which use predicate with generic type
		
		// <For your own exercise>
		// #4: Use a stream (optional exercise since we have not learned streams)

	}
	

	private static List<Person> findPeopleByAge(List<Person> people, int age) {
		List<Person> result = new ArrayList<>();
		for (Person p : people) {
			if (p.getAge() > 10) {
				result.add(p);
			}
		}
		return result;
	}

	// #1: Embed test code in a for loop
	public static List<Person> findPeopleByName(List<Person> people, String name) {

		List<Person> result = new ArrayList<>();
		for (Person p : people) {
			if (p.getName().equals(name)) {
				result.add(p);
			}
		}
		return result;
	}

	// Utility method to display the result
	// <For your own exercise>
	// - Genericize the following method so that it can
	//   take list of any type (not just list of Person type)
	public static <T> void displayResult(String prefix, List<T> results) {
		System.out.print(prefix);
		results.forEach((item) -> System.out.print(item));
		System.out.println();
	}

}
