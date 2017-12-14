package org.naic.bougeno.test;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) throws Exception {
		
		String firstString = args[0];
		String secondString = args[1];
		Boolean isAnagram = false;
		
		//Checks amount of arguments given.
		if(args.length < 2) {
			throw new Exception("Error: 2 arguments required.");
		}
		else if(args.length > 2) {
			throw new IllegalArgumentException("Error: No more than 2 arguments");
		}
		
		//Creating two copies of the strings, without spaces.
		String copyOfFirstString = firstString.replaceAll("\\s", "");
		String copyOfSecondString = secondString.replaceAll("\\s", "");
		
		//Checks length of both strings to make sure they match.
		if(copyOfFirstString.length() != secondString.length()) {
			System.out.println(isAnagram);
		}
		else {
			
			//passes both strings into character arrays
            char[] firstStringArray = copyOfFirstString.toLowerCase().toCharArray();
            char[] secondStringArray = copyOfSecondString.toLowerCase().toCharArray();
			
            //Sorts both arrays by character.
            Arrays.sort(firstStringArray);
            Arrays.sort(secondStringArray);
			
			isAnagram = Arrays.equals(firstStringArray, secondStringArray);
			
			System.out.println(isAnagram);
		}
		
		
	}
	
	
}
