package mthds;

public class Methodpgm {

	public static void main(String[] args) {
	
		
	

	Methodpgm ob = new Methodpgm();
	ob.add();
int subt=ob.sub();
	}
	//1.method without returntype and without parameter
	
	
	public void add()
	{
		int a=30,b=40;
		int c=a+b;
		System.out.println(c);
		
		
	}
	
//2.method with return type nd without parameter
	public int sub()
	{
		int a=30,b=20;
		int c=a-b;
		return c;
	}
	
	//3.method with returntype and with parameter
	
	
public int mul(int a,int b)
{
	int c=a*b;
	return c;
	
	
}
	//method without returntype and with parameter
public void div(double a,double b)
{
	double c=a/b;
	System.out.println(c);
}
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	}


