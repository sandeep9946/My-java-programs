package com.javapractise.programs;

import java.util.Arrays;

public class Merge2Arrays {

	public static void main(String[] args) {
		int count=0;
		int a[] = {12,5,25,16,100};
		int b[] = {55,2,33,4,50};
		int c[] = new int[a.length + b.length];
		Arrays.sort(a);
		Arrays.sort(b);
		
		for(int i= 0; i<=a.length-1;i++) 
		{
			c[i]=a[i];
			count++;
		}
		for(int i= 0; i<=b.length-1;i++) 
		{
			c[count++]=b[i];
		}
		Arrays.sort(c);
		System.out.println("Merge array : ");
		for(int i= 0; i<=c.length-1;i++) 
		{
			System.out.println(c[i]);
		}

	}

}
