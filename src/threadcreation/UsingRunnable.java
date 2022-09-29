package threadcreation;

public class UsingRunnable implements Runnable
{
	public void run()
	{
		System.out.println("Thread task.");
	}
	public static void main(String[] args)
	{
		UsingRunnable ur=new UsingRunnable();
		Thread th=new Thread(ur);
		th.start();
	}
}
