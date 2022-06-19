package com.assignments;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)  {
		
		Scanner sc=new Scanner(System.in);
		String word; 
		String revers="";
				
			System.out.println("Enter a word: ");	
			word=sc.next();
				
				
			int i=word.length()-1;
			
			
			while (i>=0)
			{
						
			revers+=word.charAt(i);
				
			i--;
			
					
			}
		
		if (revers.equals(word))
		{
			System.out.println("This is a Palindrome");
		}
		else 
		{
			System.out.println("This is not a Palaindrome");
			
		}
	}

}
