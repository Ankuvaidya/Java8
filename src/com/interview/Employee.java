package com.interview;

public class Employee {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public Employee() {
		super();
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public static void main(String args[]) {

		final Employee emp = new Employee();
		emp.setId(1);
		emp.setId(2);
		System.out.println(emp);
		final Employee emp1 = new Employee(1, "Ankita");
		emp1.setId(1);
		emp1.setId(2);
		System.out.println(emp1);

	}
}
