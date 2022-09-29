package Operators;

public class UnaryOperator
{
	public static void main(String args[])
	{  
		int x=10;
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10
		
		System.out.println("----------");
		
		int a=10;
		int b=10;
		System.out.println(a++ + ++a);//10+12=22  
		System.out.println(b++ + b++);//10+11=21  
		
		System.out.println("----------");
		
		int a1=10;  
		int b1=-10;  
		boolean c1=true;  
		boolean d1=false;  
		System.out.println(~a1);//-11 (minus of total positive value which starts from 0)  
		System.out.println(~b1);//9 (positive of total minus, positive starts from 0)  
		System.out.println(!c1);//false (opposite of boolean value)  
		System.out.println(!d1);//true  
		
	}
}
