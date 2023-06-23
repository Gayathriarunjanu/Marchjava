package Constructorpgm;

public class Student2 {

	

	int student2id;
	String student2name;
	String college="coet";
	
	public Student2(int studentid,String studentname)
	{
		this.student2id=studentid;
		this.student2name=studentname;
	}
	
	public void display()
	{
		System.out.println("student2id="+student2id);
		System.out.println("student2name="+student2name);
	}
	
	
	
	
	
	public static void main(String[] args) {
	
	
	Student2 s=new Student2(101,"hari");
	System.out.println(s.student2id);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


