package threadcreation;

public class UsingThread extends Thread
{
	public void run()
	{
		System.out.println("Thread task.");
	}
	public static void main(String[] args)
	{
		UsingThread ut=new UsingThread();
		ut.start();
	}
}
