package mypackage;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {

		Consumer<String> consumer1 = x -> System.out.println(x);
		Consumer<Integer> consumer2 = x -> System.out.println(x * x);

		// Call Consumer object directly
		consumer1.accept("Code with Passion!");
		consumer2.accept(5);

		// Pass Consumer object to a method as an argument
		consumeSomething(consumer1, "JPassion");
		consumeSomething(consumer2, 11);

		// Pass BiConsumer object to a method as an argument
		BiConsumer<String, String> biConsumer1 = (x, y) -> System.out.println(x.toUpperCase().concat(y.toUpperCase()));
		BiConsumer<String, String> biConsumer2 = (x, y) -> System.out.println(x.toLowerCase().concat(y.toLowerCase()));
		consumeSomething2(biConsumer1, "JPassion", ".Com");
		consumeSomething2(biConsumer2, "Sang", "Shin");

		BiConsumer<String, Integer> biConsumer3 = (x, y) -> System.out.println(x + " and " + y);
		consumeSomething2(biConsumer3, "Sang", 45);

		// <For your own exercise>
		// -Create a Consumer object that takes a String and displays the
		//  length of it
		// -Call accept(..) method of the Consumer object with your name
		// -Pass the Consumer object to consumeSomething(..) method as an
		//  argument
		Consumer<String> consumer3 = s -> System.out.println(s.length());
		consumer3.accept("Sang Shin");
		
		consumeSomething(consumer3, "Sang Shin");

	}

	public static <T> void consumeSomething(Consumer<T> consumer, T t) {
		consumer.accept(t);
	}

	public static <T, U> void consumeSomething2(BiConsumer<T, U> consumer, T t, U u) {
		consumer.accept(t, u);
	}

}
