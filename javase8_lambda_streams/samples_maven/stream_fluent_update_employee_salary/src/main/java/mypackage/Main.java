package mypackage;

import java.util.ArrayList;
import java.util.List;

// In this step, you are going to find all employees whose salary 
// is less than 40000 dollars and who are located in USA and raise 
// their salary by 10%.  You are going to perform this operation 
// via both external and internal iteration.

public class Main {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Sang", 20000, "USA"));
		list.add(new Employee(2, "Jon", 30000, "USA"));
		list.add(new Employee(3, "Mary", 40000, "Mexico"));
		list.add(new Employee(4, "Leo", 50000, "USA"));
		list.add(new Employee(4, "Bill", 60000, "Korea"));

		System.out.println("---- Non-stream (External iteration) operation ----");
		for (Employee e : list) {
			if (e.getSalary() < 40000 && e.getCountry() == "USA") {
				e.setSalary(e.getSalary() * 110 / 100);
			}
		}
		for (Employee e : list) {
			System.out.println(e.getSalary());
		}

		list = new ArrayList<>();
		list.add(new Employee(1, "Sang", 20000, "USA"));
		list.add(new Employee(2, "Jon", 30000, "USA"));
		list.add(new Employee(3, "Mary", 40000, "Mexico"));
		list.add(new Employee(4, "Leo", 50000, "USA"));
		list.add(new Employee(4, "Bill", 60000, "Korea"));

		System.out.println("---- Stream (Internal iteration) operation ----");
		list.stream()
				.filter(e -> e.getSalary() < 40000 && e.getCountry() == "USA")
				.forEach(e -> e.setSalary(e.getSalary() * 110 / 100));

		list.forEach(e -> System.out.println(e.getSalary()));

		// <For your own exercise>
		// - Create a stream from the list and filter only the people 
		//   the length of whose name is 4 characters and whose salary is less
		//   than 50000 and then raise their salary by 100%
	}

}
