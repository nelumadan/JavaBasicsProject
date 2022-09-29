package Inheritance;
//hierarical Inheritance
public class A2 
{
	void showA2()
	{
			System.out.println("A2 class method");
	}
	public static void main(String[] args)
	{
		A2 obj1=new A2();
		obj1.showA2();
		System.out.println("---------------------");
		B2 obj2=new B2();
		obj2.showA2();
		obj2.showB2();
		System.out.println("---------------------");
		C2 obj3=new C2();
		obj3.showA2();
		obj3.showC2();
	}
}
class B2 extends A2
{
	void showB2()
	{
			System.out.println("B2 class method");
	}
}
class C2 extends A2
{
	void showC2()
	{
			System.out.println("C2 class method");
	}
}

