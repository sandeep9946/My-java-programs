package com.javapractise.programs;

public class Factorial1 {

	public static void main(String[] args) {
		
		
		int num=5, fact=1;
		int i = 1;
		while(i<=num)
		{
			fact = fact * i;
			i++;
		}
		
		System.out.println(fact);
	}

}
