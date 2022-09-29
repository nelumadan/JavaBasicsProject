package Multithreading;
//Performing multiple task from multiple threads.
class MyThread1 extends Thread
{
	public void run()
	{
		System.out.println("Task1");
	}
}
class MyThread2 extends Thread
{
	public void run()
	{
		System.out.println("Task2");
	}
}
class MyThread3 extends Thread
{
	public void run()
	{
		System.out.println("Task3");
	}
}
public class MultiMulti
{
	public static void main(String[] args)
	{
		MyThread1 t1=new MyThread1();
		t1.start();
		
		MyThread2 t2=new MyThread2();
		t2.start();
		
		MyThread3 t3=new MyThread3();
		t3.start();
	}
}

