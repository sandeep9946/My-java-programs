package com.javapractise.programs;

public class RotateAnArray {

	public static void main(String[] args) {
		
		
		int a[] = {12,5,25,16,100};
		int i;
		int last = a[a.length-1];
		for(i=a.length-1;i>0;i--) 
		{
		a[i] = a[i-1];
		
		 System.out.print(a[i] + " ");  
			
		}
	
	 

	}

}
