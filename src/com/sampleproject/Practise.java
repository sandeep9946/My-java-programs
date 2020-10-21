package com.sampleproject;

import java.util.HashMap;

public class Practise {
	

	public static void charcount(String string) {
		
		HashMap<Character,Integer> countmap = new HashMap<Character,Integer>();
		char[] strArray = string.toCharArray();
		for(char c : strArray) 
		{
			if(countmap.containsKey(c)) 
			{
				countmap.put(c, countmap.get(c)+1);
			}
			else 
			{
				countmap.put(c, 1);
			}
		}
		
		System.out.println(string+":"+countmap);
		
	}

	public static void main(String[] args) {
		charcount("All is well");

	}


}
