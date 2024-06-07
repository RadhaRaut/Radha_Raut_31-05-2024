package com.stringclass;

public class Example1 {

	/*
	 * name = char array 
	 */
	
	
	public static void main(String[] args)
	{
		char charValue = 'S';
		System.out.println(charValue);
		
		char name[]= {'R','A','D','H','A'};
		System.out.println(name);
		
		System.out.println(name.hashCode());
		
		String myName ="Radha";      // literal way of creating an object
		System.out.println(myName);
		myName.concat("tushar");
		System.out.println(myName.concat(" tushar"));
		System.out.println(myName.hashCode());
		
		
		
	}
}
