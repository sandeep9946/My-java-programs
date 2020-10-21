package com.javapractise.programs;

import java.util.Arrays;

public class StringAnagram {
	/*
	 * Remove spaces between both the strings
	 * Convert string1 and string2 to character array for comparing
	 * Make both string lower cases
	 * Check length of both the strings
	 * Sort both the character array and compare them
	 */
	
	public static void Anagram(String str1,String str2) 
	{
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		boolean status = true;
		if(str1.length()!=str2.length()) 
		{
			status = false;
		}
		char[] string1 = s1.toLowerCase().toCharArray();
		char[] string2 = s2.toLowerCase().toCharArray();
		
		Arrays.sort(string1);
		Arrays.sort(string2);
		
		status = Arrays.equals(string1, string2);
		
		if (status) {  
            System.out.println(str1 + " and " + str2 + " are anagrams");  
        } else {  
            System.out.println(str1 + " and " + str2 + " are not anagrams");  
        }  
		
	
	}

	public static void main(String[] args) {
		
		Anagram("lIsTen", "SiLeNt");
		Anagram("Mother In Law", "Hitler Woman");

	}

}
