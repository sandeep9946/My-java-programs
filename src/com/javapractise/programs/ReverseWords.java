package com.javapractise.programs;

public class ReverseWords {
	
	public static void EnterTheString(String str)
	{
		
		String ReverseString = "";
		String words[] = str.split(" ");
		
		for(int i = 0; i<words.length;i++) 
		{
			String word = words[i];
			String reverseword = "";
			
			for(int j = word.length()-1; j>=0;j--) 
			{
				reverseword = reverseword + word.charAt(j);
			}
			
			ReverseString = ReverseString + reverseword + " ";
			
		}
		
		System.out.println(ReverseString);
	}

	public static void main(String[] args) {
		
		EnterTheString("All is well");
		

	}

}
