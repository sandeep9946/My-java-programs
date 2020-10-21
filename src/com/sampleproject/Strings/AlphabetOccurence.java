package com.sampleproject.Strings;

public class AlphabetOccurence {

	public static void main(String[] args) {
		
		String str = "JAVA";
		int count=0;
	char i;
		
		for(i = 'A';i<='Z'; i++) 
		{
			for(int j =0;j<=str.length()-1; j++) 
			{
				if (str.charAt(j)==i)
				
				{
					count++;
				}
				
			}
			if(count!=0) {
				System.out.println(i+ " " +count);
				count=0;}
		}
		
	
	}

}
