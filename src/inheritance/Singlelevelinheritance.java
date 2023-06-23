package inheritance;

class Animal
{
	public void animalfood()
	
	{
		System.out.println("animalfood");
		
	}
}

class Dog extends Animal
{
	public void breed()
	{
		System.out.println("lab");
		
	}
}
class Babydog extends Dog
{
	public void babydogfeature()
	{
		
		System.out.println("babydog");
	}
}





public class Singlelevelinheritance {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog ob=new Dog();
ob.animalfood();
ob.breed();

		
		
		Babydog baby=new Babydog();
		baby.animalfood();
		baby.breed();
		baby.babydogfeature();
		
		
		
		}

}
