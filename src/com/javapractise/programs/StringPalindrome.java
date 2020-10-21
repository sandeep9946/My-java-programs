package com.javapractise.programs;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String str1 = "malayalam";
		String Rev = "";	
		for (int i=str1.length()-1;i>=0;i--) 
		{
			Rev = Rev + str1.charAt(i);
		}
		
		if(Rev.equals(str1)) 
		{
			System.out.println("Palindrome");
		}
		else 
		{
			System.out.println("Non Palindrome");
		}
		
	}

}
