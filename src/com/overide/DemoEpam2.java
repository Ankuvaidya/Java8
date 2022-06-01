package com.overide;

class Customer {

	public String add(Object ob1, Object ob2) {
		return "String add(Object ob1, Object ob2)";
	}

	public String add(String a, String b) {
		return "String add(String a, String b)";
	}

//	public String add(StringBuffer sb, StringBuffer sb2) {
//		return "String add(StringBuffer sb,StringBuffer sb2)";
//	}
}

public class DemoEpam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		String output = c.add(null, null);
		System.out.println("output :" + output);
	}

}
