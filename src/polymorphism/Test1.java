package polymorphism;
//run time polymorphism (method overriding)
public class Test1 
{
	void show()
	{
		System.out.println("Method of Test1");
	}
}

class Test2 extends Test1
{
	void show()
	{
		System.out.println("Method of Test2");
	}
	
	public static void main(String[] args)
	{
		Test1 t1=new Test1();
		t1.show();
		Test2 t2=new Test2();
		t2.show();
		Test1 t3=new Test2();
		t3.show();
	}
}