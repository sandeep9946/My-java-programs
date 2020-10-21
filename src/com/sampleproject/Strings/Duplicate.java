package com.sampleproject.Strings;

import java.util.HashSet;

public class Duplicate {

	public static void main(String[] args) {
		
		String str = "Alliswell";
		HashSet<Character> set=new HashSet();
		char[] strarray = str.toCharArray();
		
		for(char ch : strarray) 
		{
			set.add(ch);
		}
		
		System.out.println(set);
		
		
	}

}
