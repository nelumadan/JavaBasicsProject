package St_method;
//static method display() can only access static variable i.
//static method can call only static methods directly.
public class Test2
{
	static int i=10;
	static void display()
	{
		System.out.println("static variable i= "+i);
	}
	static void show()
	{
		System.out.println("static method show");
	}
	public static void main(String[] args)
	{
		display();
		show();
	}
}
