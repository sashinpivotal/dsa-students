package mypackage;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

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
		Function<Person, Person> aFunction1 = person -> {
			person.setName(person.getName().toUpperCase());
			return person;
		};
		convertPeople(people, aFunction1);
		displayResult("---->#2a: ", people);

		Function<Person, Person> aFunction2 = person -> {
			person.setName(person.getName().toLowerCase());
			return person;
		};
		convertPeople(people, aFunction2);
		displayResult("---->#2b: ", people);

		Function<Person, Person> aFunction3 = person -> {
			person.setName(person.getName().toLowerCase());
			person.setAge(person.getAge() + 10);
			return person;
		};
		convertPeople(people, aFunction3);
		displayResult("---->#2c: ", people);

		// #3: call methods which use Function with generic type
		convert(people, aFunction1);
		displayResult("---->#3a: ", people);
		convert(people, aFunction2);
		displayResult("---->#3b: ", people);
		convert(people, aFunction3);
		displayResult("---->#3c: ", people);

		Function<Fruit, Fruit> aFunction4 = fruit -> {
			fruit.setName(fruit.getName().toUpperCase());
			return fruit;
		};
		convert(fruits, aFunction4);
		displayResult("---->#3d: ", fruits);

		// #4: Use a stream (optional exercise since we
		//     have not learned streams yet)
		convertUsingStream(people, person -> {
			person.setName(person.getName().toUpperCase());
			return person;
		});
		
		convertUsingStream(fruits, fruit -> {
			fruit.setName(fruit.getName().toLowerCase());
			return fruit;
		});

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

	// #2: Use Function with specific type
	public static void convertPeople(List<Person> people,
			Function<Person, Person> aFunction) {
		for (Person p : people) {
			aFunction.apply(p);
		}
	}

	// #3: Use Function with generic type
	public static <T, R> void convert(List<T> myList, Function<T, R> aFunction) {
		//		for (T t : myList) {
		//			aFunction.apply(t);
		//		}

		// Same as above
		myList.forEach(t -> aFunction.apply(t));
	}

	// #4 Use stream
	public static <T, R> void convertUsingStream(List<T> myList, Function<T, R> aFunction) {
		myList.stream().map(aFunction).forEach(item->System.out.println(item));
	}

	// Utility method to display list of items
	public static <T> void displayResult(String prefix, List<T> results) {
		System.out.print(prefix);
		results.forEach(item -> System.out.print(item + " "));
		System.out.println();
	}

}
