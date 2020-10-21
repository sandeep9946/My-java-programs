package com.javapractise.programs;

public class Fibonacci {

	public static void main(String[] args) {
		int num=8;
		int a=0,b=1;
		int c=0;
		System.out.println(a);
		System.out.println(b);
		
		
		for(int i=0;i<num;i++)
		{
			c = a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		

	}

}
