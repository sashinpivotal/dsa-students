package mypackage;

public class Main {

	public static void main(String[] args) {

		// Set variables with lambda expressions
		Calculator multiply = (x, y) -> {return x * y;}; // return is specified
		Calculator divide = (x, y) -> x / y; // single expression body
		int product = multiply.calculate(50, 10);
		int quotient = divide.calculate(50, 10);

		System.out.println("product = " + product + " quotient = " + quotient);

		// Pass lambda expression as arguments
		someMethod(multiply, divide);

		// Pass lambda expression as arguments
		someMethod((x, y) -> { return x * y;}, // return is specified
				   (x, y) -> x / y);           // single expression body
		
		// <For your own exercise>
		// - Add "add" and "subtract" Calculator type objects and
		//   invoke them using some numbers
		// - Make sure you use single expression body syntax

	}

	public static void someMethod(Calculator m, Calculator d) {
		int product = m.calculate(60, 10);
		int quotient = d.calculate(60, 10);
		System.out.println("product = " + product + " quotient = " + quotient);
	}

}
