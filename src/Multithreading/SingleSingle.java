package Multithreading;
//Performing single task from single thread.
class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("Task1");
	}
}

public class SingleSingle
{
	public static void main(String[] args)
	{
		Thread1 t1=new Thread1();
		t1.start();
	}
}

