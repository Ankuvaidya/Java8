package com.java.comparision;

import java.util.Comparator;

public class Address  implements Comparable <Address>{
	private String street;
	private int pincode;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public Address(String street, int pincode) {
		super();
		this.street = street;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", pincode=" + pincode + "]";
	}

	
//	@Override
//	public int compareTo(Address o) {
//		// TODO Auto-generated method stub
//		return this.pincode-o.getPincode();
//	}
//	
	public int compareTo(Address o) {
		// TODO Auto-generated method stub
		return this.street.compareTo(o.getStreet());
	}
	

}
