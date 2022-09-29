package ThisSuperExample;

public class A
{
	int i=10;
}
class B extends A
{
	int i=20;
	void show(int i)
	{
		System.out.println(i); //will print the value of i=30 passed as an argument while calling method(local variable)
		System.out.println(this.i); //will print i=20 (current class instance variable)
		System.out.println(super.i); //will print i=10 (parent class instance variable)
	}
	public static void main(String[] args)
	{
		B ob=new B();
		ob.show(30);
	}
}
