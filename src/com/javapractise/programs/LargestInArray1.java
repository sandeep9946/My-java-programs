package com.javapractise.programs;

public class LargestInArray1 {

	public static void main(String[] args) {
		
		int a[] = {12,5,25,16,3,100,99,33};
		int max = a[0];
		
		for(int i = 1; i<a.length-1;i++) 
		{
			if(a[i]>max) 
			{
				max=a[i];
			}
		}
		
System.out.println("Largest : " +max);
	}

}
