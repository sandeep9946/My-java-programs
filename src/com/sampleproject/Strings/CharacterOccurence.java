package com.sampleproject.Strings;

import java.util.HashMap;
import java.util.Set;

public class CharacterOccurence {
	

	public static void charcount(String string) {
	
		//Creating a hashmap with character as key and occurence as value
		HashMap<Character,Integer> charcountmap = new HashMap<Character,Integer>();
		
		//Convert String array to character array
		char[] strArray = string.toCharArray();
		
		//Checking each character of string array
		for(char c : strArray) {
			
			if(charcountmap.containsKey(c))
			{
				//If char 'c' is found in countmap, putting 'c' into charcountmap with '1' as it's value.
				charcountmap.put(c, charcountmap.get(c)+1);
				
			
			}
			else 
			{
				//If char 'c' is not found in countmap, increment its value by 1
				charcountmap.put(c, 1);
			}
			
		}
		
		System.out.println(charcountmap+":"+string);
		
	    //Obtaining set of keys
	   Set<Character> keys = charcountmap.keySet();
	 
	    //Display count of chars if it is greater than 1. All duplicate chars would be having value greater than 1.    
	   for(Character ch:keys){
	    if(charcountmap.get(ch) > 1){
	    System.out.println("Char "+ch+" "+charcountmap.get(ch));}
	}

	}
	


	public static void main(String[] args) {
		
		
		charcount("Alliswell");
	}


}
