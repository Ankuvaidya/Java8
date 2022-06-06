package com.java.hash;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.interview.Test;

public class Customer {
	private String name;
	private int age;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

//	@Override
//	public boolean equals(Object obj) {
//		
//		if(obj==null) || getClass() != obj.getClass() {
//			return false;
//		}
//		if(obj== this) {
//			return true;}
//		Customer other = (Customer) obj;
//		return this.getAge()==other.getAge();
//	}
//}
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Customer other = (Customer) obj;
//		if (age != other.age)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}

	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Customer c1 = new Customer("anku", 20);
		Customer c2 = new Customer("bnku", 29);

		System.out.println("Shallow comparision:" + (c1 == c2));
		System.out.println("Deep comparision:" + (c1.equals(c2)));
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		List<Customer> cs = new ArrayList<Customer>();
		cs.add(c1);
		cs.add(c2);

		Optional<Customer> cus = cs.stream().max((e1, e2) -> e1.getAge() - e2.getAge());
		int age = cus.get().getAge();
		System.out.println("age = " + age);
		
		
		Optional<Customer> cusName=cs.stream().filter(s->s.getName().equalsIgnoreCase("anku")).findAny();
				if(cusName.isPresent()) {
					System.out.println(cusName.get().getAge());
				}
				
				cs.stream().map(s-> s.getName()).filter(s-> s.startsWith("a")).forEach(System.out::println);
				
//				++++++++++++++++++++++++++++++++++++++++++++++++++
			
				
				
				
				
				
				
				
				
	}


}
