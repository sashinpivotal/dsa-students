package mypackage;

public class Employee {
	public int id;
	private String name;
	private int salary;
	private String country;

	public Employee(int id, String name, int salary, String country) {
		this.id = id;
		this.setName(name);
		this.salary = salary;
		this.country = country;
	}

	public void setSalary(int sal) {
		this.salary = sal;
	}

	public int getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}