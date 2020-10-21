package com.javapractise.programs;

public class Fibonacci1 {

	public static void main(String[] args) {
		
		int a = 0,b = 1, c = 0, num = 8;
		System.out.println(a);
		System.out.println(b);
		
		int i=1;
		
		while(i<num) 
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(b);
			i++;
		}

	}

}
