package com.java.comparision;

import java.util.Comparator;

public class NameComparision  implements Comparator<Patient>{

	@Override
	public int compare(Patient o1, Patient o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
