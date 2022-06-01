package com.overide;

//Superclass
class Superclass {
    
   public static void display() {
       System.out.println("Display Superclass ");
   }
    public void print()  {
        System.out.println("Print Superclass ");
   }
    
    public final void printA() {
        System.out.println("Print Subclass final method");
  }
}

class Subclass extends Superclass {
    
   public static void display() {
        System.out.println("Display Subclass");
   }
    
   public void print() {
        System.out.println("Print Subclass");
  }
   
   public void printA(int a) {
       System.out.println("Print Subclass final method");
 }
}
//////
//Driver class
public class Test {
   public static final void main(String args[ ])  {
      Superclass obj1 = new Subclass();
      obj1.display(); 
      obj1.print();    
      
      Subclass obj = new Subclass();
      obj.display(); 
      obj.print();  
   
      
   }
}

