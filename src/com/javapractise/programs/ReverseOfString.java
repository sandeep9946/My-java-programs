package com.javapractise.programs;

public class ReverseOfString {

	public static void main(String[] args) {
		
		
		String str1 = "java is a programming lang";
		String Rev = "";	
		for (int i=str1.length()-1;i>=0;i--) 
		{
			Rev = Rev + str1.charAt(i);
		}
		
		System.out.println(Rev);
		

	}

}
