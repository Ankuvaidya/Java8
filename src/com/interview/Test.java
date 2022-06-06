package com.interview;


  class Demod {
	
	protected int a;
	protected  String ab;
	private  int b=1;
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
}
public class Test {

	public static void main(String[] args) {
		
		Demod d= new Demod();			
		System.out.println(d.a);
		System.out.println(d.ab);
		System.out.println(d.getB());
		
	}

}
