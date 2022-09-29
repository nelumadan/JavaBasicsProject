package ExceptionHandling;

public class tryCatchFinally
{
	public static void main(String[] args)
	{
		try
		{
			int a=100, b=2, c=0;
			int d=a/b;
			System.out.println(d);
			int e=a/c;
			System.out.println(e );
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception: "+e);
		}
		finally
		{
			System.out.println("I am in finally block");
		}
	}
}
