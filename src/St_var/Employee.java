package St_var;
//company is same for everyone so declared it as static
class Employee
{
	int empid;
	String name;
	static String company="Home";
	
	Employee(int empid, String name)
	{
		this.empid=empid;
		this.name=name;
	}
	void display() 
	{
		System.out.println(empid+" "+name+" "+company);
	}
	public static void main(String[] args)
	{
		Employee e1=new Employee(101, "Anil");
		e1.display();
		Employee e2=new Employee(102, "Neelam");
		e2.display();
	}
}
