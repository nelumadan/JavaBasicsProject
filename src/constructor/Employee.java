package constructor;
//Parameterized constructor used to initialize the object
public class Employee 
{
	String name;
	int emp_id;
	
	Employee(String name, int emp_id)
	{
		this.name=name;
		this.emp_id=emp_id;
	}
	public static void main(String[] args)
	{
		Employee e1=new Employee("Anil", 101);
		Employee e2=new Employee("Neelam", 102);
		
		System.out.println("Employee 1: "+e1.name+" "+e1.emp_id);
		System.out.println("Employee 2: "+e2.name+" "+e2.emp_id);
	}
}
