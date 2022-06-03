package mypackage;

import java.util.Calendar;
import java.util.Date;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {

		Predicate<Double> predicate1 = x -> x > 10;
		System.out.println(predicate1.test(new Double(9)));
		
		Predicate<String> predicate2 = x -> x.length() > 5;
		System.out.println(predicate2.test("JPassion.com"));
		
		BiPredicate<Double, Double> predicate3 = (x, y) -> x + y > 10;
		System.out.println(predicate3.test(new Double(3), new Double(2)));
		
		BiPredicate<String, Integer> predicate4 = (x, y) -> x.length() > y;
		System.out.println(predicate4.test("JPassion.com", 5));
		
		// <For your own exercise>
		// - Create Predicate object which receives a Date object and returns
		//   true if the Date is later than the current date and time and 
		//   false otherwise
		Predicate<Date> myPredicate = date -> {
			// Set current time
			Calendar calendarCurrenttime = Calendar.getInstance();
			calendarCurrenttime.setTime(date);
			
			// Set noon
			Calendar calendarNoon = Calendar.getInstance();
			calendarCurrenttime.set(Calendar.HOUR_OF_DAY, 12);
			
			return calendarCurrenttime.before(calendarNoon);
		};
		
		System.out.println(myPredicate.test(new Date()));
		

	}

}
