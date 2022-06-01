package com.java.comparision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p1= new Patient(23, "ankita", new Address("hastinapur", 444604));
		Patient p2= new Patient(22, "viha", new Address("kerala", 444607));
		Patient p3= new Patient(21, "kalpesh", new Address("agra", 444704));
		Patient p4= new Patient(27, "kavi", new Address("shimla", 444694));
		Patient p5= new Patient(20, "anuj", new Address("ooty", 444804));
		
		List<Patient> p= new ArrayList<Patient>() ;
		
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		Collections.sort(p, new AgeComparision());
		System.out.println("Comparision using age");
		System.out.println(p.get(0));
		System.out.println(p.get(1));
		System.out.println(p.get(2));
		System.out.println(p.get(3));
		System.out.println(p.get(4));
		System.out.println("****Comparision using name****");
		Collections.sort(p, new NameComparision());
		System.out.println(p.get(0));
		System.out.println(p.get(1));
		System.out.println(p.get(2));
		System.out.println(p.get(3));
		System.out.println(p.get(4));
		
		System.out.println("****Comparision using address pincode****");
		Collections.sort(p, new StreetComparision());
		System.out.println(p.get(0));
		System.out.println(p.get(1));
		System.out.println(p.get(2));
		System.out.println(p.get(3));
		System.out.println(p.get(4));
		
		
	}

}
