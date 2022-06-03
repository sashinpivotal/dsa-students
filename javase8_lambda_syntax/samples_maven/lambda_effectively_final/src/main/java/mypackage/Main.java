package mypackage;

public class Main {

	public static void main(String[] args) {

		int myInt = 100;

		// Set variables with lambda expressions
		Calculator multiply = (int x, int y) -> {
//			 myInt = 200;   // Compile error
			return x * y * myInt;
		};
		
		int product = multiply.calculate(50, 10);

		System.out.println("product = " + product );

	}
	
	// <For your own exercise>
	// - Add "int yourInt=200;"
	// - Try to use "yourInt" in the body of the lambda and see what happens

}
