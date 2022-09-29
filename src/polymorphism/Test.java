package polymorphism;
//compile time polymorphism (method overloading)
public class Test 
{
	void show()
	{
		System.out.println("no argument method");
	}
	void show(int a)
	{
		System.out.println("int method");
	}
	void show(String b)
	{
		System.out.println("string method");
	}
	public static void main(String[] args)
	{
		Test t=new Test();
		t.show();
		t.show(10);
		t.show("abc");
	}
}
