package com.javapractise.programs;

public class SecondLargest1 {

	public static void main(String[] args) {
		
		int a[] = {3,10,100,55,88,0,1,99,25,33,69};
		int size = a.length;
		System.out.println("Size of Array :" +size);
		int temp = 0;
		
		for(int i=0; i<a.length; i++) 
		{
			for(int j=i+1; j<a.length; j++) 
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		System.out.println("Sorted Array : ");
		for(int x : a) 
		{
			System.out.println(x);
		}
		System.out.println("Second Largest in Array :"+a[size-2]);
		
	}

}
