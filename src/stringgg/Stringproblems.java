package stringgg;

import java.util.Scanner;

public class Stringproblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//problem1 concatenation
		String s="jmeter";
		String	s1="performance testing tool";
		System.out.println(s+s1);
	
		
		//problem2  i/p-java language is platform dependent
		//check language is present in given string
		
		String s2="java language is platform dependent";
		if(s2.contains("language"))
		
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
			
		
		}
	
	//java program to count all vowels in a string
		
		System.out.println("enter a string");
		
		Scanner sc=new Scanner(System.in);
		String s3=sc.nextLine();
		
		int c=0;
		for(int i=0;i<=s3.length();i++)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
		
			{
				c++;
			}
		
		}
		System.out.println("vowel count="+c);
		
		
		
		
		//String s3="selenium webdriver is used for webapplication testing"
		//split the above string and print all the words, stop execution when webapplication is diplay
	String s4="selenium webdriver is used for webapplication testing";
String a[]	=s4.split(" ");
	for(String s4:a)
	{
	
	
	
	
	
	
	
	
	
	
	
	}

}
