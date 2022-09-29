package Interface;

public interface I1
{
	void show();
	public static void main(String[] args)
	{
		Test t=new Test();
		t.show();
	}
}

class Test implements I1
{
	public void show()
	{
		System.out.println("Test class method.");
	}
}