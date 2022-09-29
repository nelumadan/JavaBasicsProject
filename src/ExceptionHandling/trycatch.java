package ExceptionHandling;
//exception handling by try catch method and printing the exception info by different methods
public class trycatch
{
	public static void main(String[] args)
	{
		try
		{
			int a=100, b=0;
			int c=a/b;
		}
		catch(ArithmeticException e)//e is the reference var pointing to object created by the method() in which the exception occured which holds the exception info
		{
			System.out.println(e);//prints the exception information(exception name and description but no stack trace)
			System.out.println(e.toString());//prints the exception information(exception name and description but no stack trace)
			e.printStackTrace();//prints the exception information(exception name and description and stack trace)
			System.out.println(e.getMessage());//prints the exception information(only exception description)
			//System.out.println("cannot divide by zero");
		}
	}
}
