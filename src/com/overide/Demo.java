package com.overide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "ababa";
//
//		boolean r = isPalindrome(s);
//		System.out.println("result is: " + r);
		
		List<String> title = Arrays.asList("1","2","3");
        Stream<String> s = title.stream();
        s.forEach(System.out::println);
		
        s.forEach(System.out::println);
		List<String> name = new ArrayList<>();

		name.add("a");
		name.add("b");
		name.add("c");
		name.add("b");

		ListIterator<String> iter = name.listIterator();

		while(iter.hasNext()){

		if(iter.next().equals("c")){

		name.add("l");
		}
		System.out.println(name.size());

		}
		
	
		
	}

//	public static boolean isPalindrome(String s) {
//		int l = s.length();
//		int i = 0;
//		int j = l - 1;
//		while (i < j) {
//			if (s.charAt(i) != s.charAt(j))
//				return false;
//			i++;
//			j--;
//		}
//		return true;
//	}

}
