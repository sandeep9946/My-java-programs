package com.javapractise.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateInArrays {

	public static void main(String[] args) {
		/*
		 * 1) Convert Array to List
		 * 2) Convert List to Set
		 * 3) Create new String array with number of elements inside Set
		 * 4) Convert back Set to Array
		 * */
		
		
		String strArray[]= {"Sun", "Apple", "JBoss", "Whatsup", "Apple", "BEA Weblogic","JBoss"};
		
		List<String> list = Arrays.asList(strArray);
		Set set = new HashSet(list);	
		
		
		String b[] = new String[set.size()];
		set.toArray(b);
		
		for(int i = 0; i<b.length; i++) 
		{
			System.out.println(b[i]);
		}
		

	}

}
