package com.javapractise.programs;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {


		int a[] = {3,10,100,55,88,0,1,99,25,33,69};
		int size = a.length;
		
		Arrays.sort(a);
		
		for(int x : a)
		{
			System.out.println(x);
		}
	
		System.out.println("Second Largest : " +a[size-2]);
	}

}
