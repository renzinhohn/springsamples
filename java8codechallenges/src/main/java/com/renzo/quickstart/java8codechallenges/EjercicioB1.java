package com.renzo.quickstart.java8codechallenges;

import java.util.Scanner;

/* Cracking the Coding Interview : 189 Programming Questions and Solutions
 * This is solution to problem 1.1
 * Question: Implement an algorithm to determine if a string has all unique characters. 
 * What if you can not use additional data structures?
 */
public class EjercicioB1 {
	
	//this method has O(n^2) time and O(1) space 
	public static boolean hasUniqueChars1 (String str){
		
		// not a good idea to use length() in iteration, it will call the method n times
		int length = str.length() -1; 
		
		for (int i = 0; i < length; i++) {
			for (int j = i+1; j <= length; j++){
			if ((str.charAt(i)) == (str.charAt(j)))
					return false;
			}
		}
		return true;
	}
	
	//this method has O(n) both time and space
	public static boolean hasUniqueChars2 (String str){
		
		int[] arr = new int[128];
		
		// not a good idea to use length() in iteration, it will call the method n times
		int length = str.length();
		
		for (int i: arr)
			arr[i] = 0;
		
		for (int i = 0; i < length; i++){
			if(arr[str.charAt(i)]  == 1)
				return false;
			else
				arr[str.charAt(i)] = 1;
		}
		return true;
	}
	
	public static void main(String[] args){
		
		String str = "";
		boolean unique;
		
		System.out.println("Enter a string:");
		Scanner in = new Scanner(System.in);
	  	str = in.nextLine();
	  	str = str.toLowerCase();
		unique = hasUniqueChars2(str);
		if (unique)
			System.out.println("The string has unique characters");
		else
			System.out.println("The string does not have unique characters");
	}
}
