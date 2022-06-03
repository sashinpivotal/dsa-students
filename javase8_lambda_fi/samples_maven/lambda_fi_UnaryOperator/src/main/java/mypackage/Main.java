package mypackage;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Main {

	public static void main(String[] args) {

		UnaryOperator<String> unaryOperator1 = x -> x.toUpperCase();
		UnaryOperator<Integer> unaryOperator2 = x -> x+x;
		
		// Call apply() method of the UnaryOperator object directly
		String result1 = unaryOperator1.apply("Code with Passion!");
		System.out.println(result1);
		Integer result2 = unaryOperator2.apply(35);
		System.out.println(result2);
		
		// Pass UnaryOperator to a method as an argument
		convert1(unaryOperator1, "JPassion.com");
		convert1(unaryOperator2, 45);
		
		BinaryOperator<String> binaryOperator = (x, y) -> x.concat(y);
		convert2(binaryOperator, "JPassion", ".com");
		
		// <For your own exercise>
		// - Create BinaryOperator which takes two Integer and results the multiplication
		// - Call apply() method of the BinaryOperator passing two Integer values
		// - Call convert2() method above passing the BinaryOperator and the two Integer values
		
	}

	public static <T> void convert1(UnaryOperator<T> unaryOperator, T something) {
		System.out.println(unaryOperator.apply(something));
	}
	
	public static <T> void convert2(BinaryOperator<T> binaryOperator, T something1, T something2) {
		System.out.println(binaryOperator.apply(something1, something2));
	}
	

}
