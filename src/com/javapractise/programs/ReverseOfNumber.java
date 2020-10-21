package com.javapractise.programs;

public class ReverseOfNumber {

	public static void main(String[] args) {
		
		int num = 123;
		int temp = num;
		int rev = 0;
		int remainder = 0;
		System.out.println("Enter the number : " +num);
		while(num!=0)
		{
			remainder = num % 10;
			rev = rev * 10 + remainder;
			num = num/10;		
		}

		System.out.println("Reverse of number: " +rev);
	}

}
