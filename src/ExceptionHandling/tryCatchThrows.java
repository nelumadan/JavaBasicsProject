package ExceptionHandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
public class tryCatchThrows
{
	public static void main(String[] args)
	{
		Test t=new Test();
		try
		{
			t.readFile();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println("The program did not abnormally terminate.");
	}
}
class Test
{
	void readFile() throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream("d:/abc.txt");
	}
	void saveFile() throws FileNotFoundException
	{
		String text="This is demo.";
		FileOutputStream fos=new FileOutputStream("d:/xyz.txt");
	}
}
