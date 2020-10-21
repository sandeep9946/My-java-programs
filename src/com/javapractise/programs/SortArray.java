package com.javapractise.programs;

public class SortArray {

	public static void main(String[] args) {
		
		
		int a[] = {8,1,9,3,10,5};
		int temp = 0;
		System.out.println("Sorted Array :");
		for(int i = 0;i<=a.length-1;i++) 
		{
			for(int j=i+1;j<=a.length-1;j++) 
			{
				if(a[i]>a[j]) 
				{
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
		
		

	}

}
