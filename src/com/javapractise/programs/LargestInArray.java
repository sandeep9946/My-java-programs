package com.javapractise.programs;

import java.util.Arrays;

public class LargestInArray {

	public static void main(String[] args) {
		
		
		int a[] = {12,5,25,16,3,100,99,33};
		int size = a.length;
		
		Arrays.sort(a);
		
		for(int c : a) 
		{
		System.out.println(c);
		}
		
		System.out.println("Largest :" +a[size-1]);
		System.out.println("Second Largest :" +a[size-2]);
	}

}
