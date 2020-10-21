package com.sampleproject.Strings;

public class ReverseOfWord {
	
	public static void inputString(String str) {
		
		String[] words = str.split(" ");
		String ReverseString = "";
		
		for(int i =0;i<words.length;i++) 
		{
			String word = words[i];
			String ReverseWord= "";
			for(int j=word.length()-1;j>=0;j--) 
			{
				ReverseWord = ReverseWord + word.charAt(j);
			}
			
			ReverseString = ReverseString + ReverseWord + " ";
		}
		System.out.println(ReverseString);

		
	}

	public static void main(String[] args) {
		
		inputString("Java is a programming Language");
	}



}
