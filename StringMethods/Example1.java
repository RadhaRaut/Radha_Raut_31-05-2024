package com.StringMethods;

public class Example1 {

	public static void main(String[] args) {

		String text = "Welcome To Java";

		char characters[] = text.toCharArray();
		System.out.println(text.length());
		System.out.println("-----------------");

		for (int i = 0; i < characters.length; i++) {
			if (!Character.isWhitespace(characters[i])) {
				System.out.println(characters[i]);
				{

					if (Character.isUpperCase(characters[i])) {
						System.out.println(characters[i]);
					}
				}
				
				
			}

		}
	}

}
