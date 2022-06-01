package com.overide;

class A

{

	protected void methodA(int a, int b) {
		System.out.println("protected void methodA(int a, int b) in class A");
	}

//    protected void methodC(int a, int b,int c ) {}
//
//    public void methodB(int a, int b) {}

}

class B extends A

{

//    public void methodA(int a, int b) {
//    	System.out.println(" public void methodA(int a, int b) in class B");
//    } // valid/invalid/error/exception

//    public static void methodA(int a, int b) {}
//
	public void methodA(float a, float b) {
		System.out.println("inside public void methodA(float a, float b) in class B ");
	}
//
//   public void methodA (int a, int b) throws RuntimeException {}
//
//    }
//
//    public void methodA (int a, int b) throws Exception {}
//
//    private void methodA (int a, int b) {}    
//

	protected void methodB(int a, int b) {
		System.out.println(" protected void methodB (int a, int b) in class B");
	}

}

public class Bmain {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		b.methodA(1.1f, 1.1f);
		b.methodB(1, 2);
		

	}

}
