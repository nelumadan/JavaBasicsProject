package ExceptionHandling;
import java.util.Scanner;
class YoungerAgeException extends RuntimeException
{
	YoungerAgeException(String msg)
	{
		super(msg);
	}
}
public class tryCatchThrow
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Age");
		
		int age=s.nextInt();
		try
		{
			if(age<18)
			{
				throw new YoungerAgeException("You are not eligible to vote.");
			}
			else
			{
				System.out.println("You can vote successfully.");
			}
		}
		catch(YoungerAgeException e)
		{
			e.printStackTrace();
		}
		System.out.println("---------------------------------------------");
		System.out.println("Program did not terminate abnormally because exception is handled.");
	}
}
