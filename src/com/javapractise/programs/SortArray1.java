package com.javapractise.programs;

import java.util.Arrays;

public class SortArray1 {

	public static void main(String[] args) {
		
		int arr[] = {12,5,25,16,3,100,99,33};
		System.out.println("Before Sorting :");
		for(int a : arr ) 
		{
			System.out.println(a);
		}
		
		System.out.println("After Sorting :");
		
		Arrays.sort(arr);
		
		for(int a : arr ) 
		{
			System.out.println(a);
		}
		
	}

}
