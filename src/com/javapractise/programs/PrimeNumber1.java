package com.javapractise.programs;

public class PrimeNumber1 {

	public static void main(String[] args) {
		
		int num = 19;
		int i = 2;
		boolean flag = false;
		
		while(i<=num/2) 
		{
			if(num%i==0) 
			{
				flag = true;
				break;
			}
			i++;
		}
		if(!flag) 
		{
		System.out.println("prime");
		}
		else
		{
			System.out.println("non prime");
		}
	}

}
