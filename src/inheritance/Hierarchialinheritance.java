package inheritance;


class Animal1
{
	public void animaldetails()
	{
		System.out.println("animaldetails");
		
	}
}
class Dog1 extends Animal1
{
	public void dogdetails()
	{
		System.out.println("dog");
		
	}
}
class Tiger extends Animal1
{
	public void tigerdetails()
	{
		System.out.println("tigerdetails");
	}
}

public class Hierarchialinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 ob=new Dog1();
		ob.animaldetails();
		ob.dogdetails();
		
		Tiger t=new Tiger();
		t.animaldetails();
		t.animaldetails();
		
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
