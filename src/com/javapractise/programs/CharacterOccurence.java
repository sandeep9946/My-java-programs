package com.javapractise.programs;

import java.util.HashMap;

public class CharacterOccurence {
	
	public static void CharacterOccurenceInString(String str) 
	{
		
		
		HashMap<Character,Integer> mapcount = new HashMap<Character,Integer>();
		char[] str1 = str.toCharArray();
		
		for(char c : str1) 
		{
			if(mapcount.containsKey(c)) 
			{
				mapcount.put(c, mapcount.get(c)+1);
			}
			else
			{
				mapcount.put(c, 1);
			}
		}
		
		
		System.out.println(mapcount);
		
	}
	

	public static void main(String[] args) {

		CharacterOccurenceInString("Alliswell"); 
		
		
	}

}
