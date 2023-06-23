package polymorphism;

class car
{
	public void accelator()
	{
		System.out.println("accelator");
	}
}
class BMW extends car
{

	@Override
	public void accelator() {
		// TODO Auto-generated method stub
		super.accelator();
	
	System.out.println("bmw accelator");
	
	}

	}
public class Methodoverriding {

	public static void main(String[] args) {
		
	BMW ob=new BMW();
	ob.accelator();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
