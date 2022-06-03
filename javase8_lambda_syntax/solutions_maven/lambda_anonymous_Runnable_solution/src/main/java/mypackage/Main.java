package mypackage;

import java.util.Date;

public class Main {
	public static void main(String[] args) {

		System.out.println("=== RunnableTest ===");

		// Anonymous Runnable
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello world one!");
			}
		};

		// Lambda Runnable
		Runnable r2 = () -> System.out.println("Hello world two!");

		// Run them!
		r1.run();
		r2.run();
		
		// <For your own exercise>
		// - Create another set of Anonymous Runnable and Lambda Runnable, 
		//   when run, displays the current date and time
		
		// Anonymous Runnable
		Runnable r3 = new Runnable() {
			@Override
			public void run() {
				System.out.println(new Date());
			}
		};

		// Lambda Runnable
		Runnable r4 = () -> System.out.println(new Date());
		r3.run();
		r4.run();

	}
	
}