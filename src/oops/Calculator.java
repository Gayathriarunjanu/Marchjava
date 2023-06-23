package oops;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);
	System.out.print("Enter first number");
	int A=sc.nextInt();

	System.out.print("Enter SECOND number");
	int B=sc.nextInt();

	
	System.out.print("Enter choice 1.add 2.sub 3.mul 4.div");
	int c=sc.nextInt();
	double result=0;
	switch(c)
	{
	
	case 1:result=A+B;
	break;
	
	case 2:result=A-B;
			break;
	case 3:result=A*B;
	break;
	
	//case 4:result=A/B;                            
	                                                case 4:if(B==0)
	                                            {
	                                            	System.out.println("error");
	                                            }
	                                            else {
	                                            	result=A/B;
	                                             break;
	                                             }
	
	//break;
	
	default:System.out.println("invalid choice");
	}
	System.out.println("result="+result);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
