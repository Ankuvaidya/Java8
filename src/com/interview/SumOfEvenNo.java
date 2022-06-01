package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfEvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[]={1,2,3,4,5,6};
		List<Integer> arr= Arrays.asList(1,66,3,4,5,6);
		Integer sum=arr.stream().filter(s->s%2==0).collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sum);
		
		Integer sum1=arr.stream().filter(s->s%2==0).mapToInt(Integer:: valueOf).sum();
System.out.println(sum1);
	
arr.sort((s1,s2)->s1-s2);
System.out.println(arr);
System.out.println(arr.get(arr.size()-2));

	
	
	
	}
	

}
