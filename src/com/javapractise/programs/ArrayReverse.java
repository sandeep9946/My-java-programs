package com.javapractise.programs;

public class ArrayReverse {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		
		System.out.println("Print an Array elements : ");
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]);
		}
		System.out.println();
		System.out.println("Reverse of an Array elements : ");
		for(int i=a.length-1;i>=0;i--) 
		{
			System.out.print(a[i]);
		}
		
	}

}
