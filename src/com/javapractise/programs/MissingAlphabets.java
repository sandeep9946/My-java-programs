package com.javapractise.programs;

import java.util.Arrays;
import java.util.HashSet;

public class MissingAlphabets {

	public static void main(String[] args) {
		
		String str1 = "abcdefghijklmnopqrstuvwxyz";
		String str2 = "sandy";
		
		str1 = str1.replaceAll(" ", "");
		str2 = str2.replaceAll(" ", "");
		
		String[] s1 = str1.split("");
		String[] s2 = str2.split("");
		
		HashSet<String> string1 = new HashSet<String>(Arrays.asList(s1));
		HashSet<String> string2 = new HashSet<String>(Arrays.asList(s2));
		string1.remove(string2);
		
		System.out.println(string1);
		System.out.println(string2);
	}

}
