package assignment;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		for(int i=0;i<5;i++)
			
		{
			a[i]=sc.nextInt();
		}
		
		int s=0;
		for(int v:a)
		{
			s=s+v;
			
		}
		System.out.println("average="+s/5);
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
