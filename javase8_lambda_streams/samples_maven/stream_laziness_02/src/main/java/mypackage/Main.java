package mypackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("d2", "a2", "b1", "b3", "c2");

		System.out.println("--- No terminal operation at the end ------");
		strings.stream()
				.map(s -> s.toUpperCase())
				.filter(s -> {
					System.out.println(s);
					return s.startsWith("B");
				}); // no print
		// No terminal operation

		System.out.println("--- Terminal operation at the end ------");
		strings.stream()
				.map(s -> s.toUpperCase())
				.filter(s -> {
					System.out.println(s);
					return s.startsWith("B");
				})
				.collect(Collectors.toList());
		
		// <For your own exercise>
		// - Add a terminal operation to the first stream

	}
	
}
