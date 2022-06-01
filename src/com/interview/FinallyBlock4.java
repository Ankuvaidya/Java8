package com.interview;

public class FinallyBlock4 {
	
		@SuppressWarnings("finally")
		int m1()
		{ 
		 int a = 20, b = 0;	
		try {
		   System.out.println("I am in try block");
		   int c = a/b;
		   System.exit(0);
		   System.out.println("Result: " +c);
		  }
		catch(ArithmeticException ae)
		{
		  System.out.println("I am in catch block");
		  return 20;
		}
		finally 
		{
		  System.out.println("I am in finally block");
		  return 50;
		 }
		
		}
		 public static void main(String[] args) 
		 {
		 FinallyBlock4 obj = new FinallyBlock4();
		  System.out.println(obj.m1());
		  }
		}