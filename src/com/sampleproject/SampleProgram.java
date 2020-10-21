package com.sampleproject;

public class SampleProgram {
	
	 static int a = 5;
	
	public void m1(int c)
	{
		this.a=c;
		System.out.println(c);
		
	}
	
	static void m2(int b) 
	{
		
		a=b;
		System.out.println(b);
	}

	
	
	
	
	
	
	public static void main(String[] args) 
	{
		
		SampleProgram s = new SampleProgram();
		s.m1(100);
		s.m2(1000);
		
    }

}

