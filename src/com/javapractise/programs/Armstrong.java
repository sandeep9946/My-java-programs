package com.javapractise.programs;

public class Armstrong {

	public static void main(String[] args) {
		
		int num = 153;
		int temp = num;
		int rev = 0;
		int r = 0;
		int sum = 0;
		System.out.println("Enter the number : " +num);
		while(num!=0)
		{
			r = num % 10;
			sum = sum +  (r * r * r);
			num = num/10;		
		}
		
		if(sum==temp) 
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is not Armstrong");
		}

	}

}
