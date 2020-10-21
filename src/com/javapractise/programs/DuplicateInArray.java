package com.javapractise.programs;

import java.util.HashSet;

public class DuplicateInArray {

	public static void main(String[] args) {
		
		
		int a[] = {12,5,75,16,75,100};
		
		for(int i=0;i<a.length-1;i++) 
		{
			for(int j=i+1;j<a.length-1;j++) 
			
			if(a[i]==a[j])
			{
				System.out.println(a[i]);
			}
		
		}
		
		

	}

}
