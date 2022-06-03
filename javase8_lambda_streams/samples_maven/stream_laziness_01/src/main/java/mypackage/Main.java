package mypackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> newNumbersList = numbersList.stream()
				.filter(n -> { // intermediate operation
					System.out.println("filtering " + n);
					return n % 2 == 0;
				})
				.map(n -> { // intermediate operation
					System.out.println("mapping " + n);
					return n * n;
				})
				.limit(2) // intermediate operation
				.collect(Collectors.toList()); // terminal operation
		
		newNumbersList.forEach(n -> System.out.println(n));
		
		// <For your own exercise>
		// - increase the limit to 3 from 2 and see what happens

	}
	
}
