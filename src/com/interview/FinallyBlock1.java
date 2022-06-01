package com.interview;

public class FinallyBlock1 {
	void m1()
	{ 
	try {
	    System.out.println("I am in try block");
//	    System.exit(0);
	  }
	finally {
	  System.out.println("I am in finally block");	
	  }
	System.out.println("Statement after finally block");
	}
	 public static void main(String[] args) 
	 {
	 FinallyBlock1 obj = new FinallyBlock1();
	  obj.m1();
	  }
	}