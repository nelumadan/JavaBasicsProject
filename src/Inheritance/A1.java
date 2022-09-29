package Inheritance;
//multi level Inheritance
public class A1 
{
	void showA1()
	{
			System.out.println("A1 class method");
	}
	public static void main(String[] args)
	{
		A1 obj1=new A1();
		obj1.showA1();
		System.out.println("---------------------");
		B1 obj2=new B1();
		obj2.showA1();
		obj2.showB1();
		System.out.println("---------------------");
		C1 obj3=new C1();
		obj3.showA1();
		obj3.showB1();
		obj3.showC1();
	}
}
class B1 extends A1
{
	void showB1()
	{
			System.out.println("B1 class method");
	}
}
class C1 extends B1
{
	void showC1()
	{
			System.out.println("C1 class method");
	}
}
