package encapsulation;

public class Exceptionpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try {
		int a=20,b=0;
		int c= a/b;
		System.out.println(c);
	}
	catch(Exception e)
	{
	System.out.println(e.getMessage());
	System.out.println("airthmetic exception");
	
	System.out.println("hello");
	
	try {
		int []a=new int[2];
		a[0]=23;
		a[1]=34;
		System.out.println(a[3]);
		}
	catch(Exception f)
	{
		System.out.println("arrayindexoutofboundexception");
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
	
	


