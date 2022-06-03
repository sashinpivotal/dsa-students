package mypackage;

public class Main {

	public static void main(String[] args) {

		// Set variables with lambda expressions
		Calculator multiply = (int x, int y) -> {return x * y;}; // No simplification
		Calculator divide = (x, y) -> {return x / y;};           // Type inference simplification

		int product = multiply.calculate(50, 10);
		int quotient = divide.calculate(50, 10);

		System.out.println("product = " + product + " quotient = " + quotient);

		// Pass lambda expression as arguments
		someMethod(multiply, divide, 50, 10);

		// Pass lambda expression as arguments
		someMethod((int x, int y) -> {return x * y;}, 
				   (x, y) -> {return x / y;},
		           60, 10);

		// <For your own exercise>
		// - Add "add" and "subtract" Calculator type objects and
		//   invoke them using some numbers

	}

	public static void someMethod(Calculator m, Calculator d, int i1, int i2) {
		int product = m.calculate(i1, i2);
		int quotient = d.calculate(i1, i2);
		System.out.println("product = " + product + " quotient = " + quotient);
	}

}
