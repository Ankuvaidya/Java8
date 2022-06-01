package com.interview;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4};
		int l=arr.length;
		int[] rev;
		for(int i=0;i<l/2;i++){
			int temp=arr[i];
			arr[i]=arr[l-i-1];
			arr[l-i-1]=temp;
			
		}
		for(int i=0;i<l;i++)
		System.out.println(arr[i]);
		}

}
