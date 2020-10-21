package com.sampleproject.Strings;

public class WhiteSpace {

	public static void main(String[] args) {
		
		String str = "Java is a programming Language.";
		//str = str.replaceAll("\\s", "");
		//String str1 = str.replace('a', 'x');
		String str2 = str.replaceAll("java", "python");
		
	
		System.out.println(str2);

	}

}
