
//create a class named Member having the following members
//name
//age
//phoneno
//address
//salary
//it also has a method printdetailss which print all the detailss of members

package inheritance;

class Member
{
	String name;
	int age;
	String phoneno;
	String address;
	int salary;
	public void printDetails()
	{
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("phoneno="+phoneno);
		System.out.println("salary="+salary);
		System.out.println("name="+name);
		
	}
	
	}

class Employee extends Member
{
	String specialization;
	
}
class Manager extends Member
{
	String department;
	
}
public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Employee emp1=new Employee();
	emp1.name="arun";
	emp1.age=24;
	emp1.phoneno="2475896324";
	emp1.address="ghhbh";
	emp1.salary=50000;
	System.out.println(emp1.specialization="tester");
	emp1.printDetails();
	
	
	
	
	
	
	
	
	
	}
	

}
