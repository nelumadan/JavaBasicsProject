package Multithreading;
//Performing single task from multiple threads.
class Thread2 extends Thread
{
	public void run()
	{
		System.out.println("Task1");
	}
}

public class SingleMulti
{
	public static void main(String[] args)
	{
		Thread2 t1=new Thread2();
		t1.start();
		
		Thread2 t2=new Thread2();
		t2.start();
	}
}


