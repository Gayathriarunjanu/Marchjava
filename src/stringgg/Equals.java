package stringgg;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//equals
		String s="hello";
		String s1="welcome";
		String s2="hello how are you";
		
		
		
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		
		//contains
		System.out.println(s2.contains("how"));
		
		//touppercase & tolowercase
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//trim
		System.out.println(s1.trim());
		
		//length
		
		System.out.println(s.length());
		
		
		//startswith
		
		System.out.println(s2.startsWith("Hello"));
		
		
		//endswith
		System.out.println(s2.endsWith("You"));
		
		
		//substring
		System.out.println(s2.substring(2,6));
		
		
		//charAt
		
		
		
	System.out.println(s.charAt(1));
	
	//split
	
	
	String[] sr=s2.split(" ");
	for(String v:sr)
	{
		System.out.println(v);
		
	}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
