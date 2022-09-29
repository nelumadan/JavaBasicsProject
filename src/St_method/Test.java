package St_method;
//non static method display() can be called using an object.
//static method show() can be called directly within a class,no need to create object because it is in the same class.
//static method show1() can be called using the class because it is in different class.
public class Test
{
	void display()
	{
		System.out.println("non static method");
	}
	static void show()
	{
		System.out.println("static method in same class");
	}
	public static void main(String[] args)
	{
		Test t1=new Test();
		t1.display();
		show();
		Test1.show1();
	}
}
class Test1
{
	static void show1()
	{
		System.out.println("static method in different class");
	}
}
