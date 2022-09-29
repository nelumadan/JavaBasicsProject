package Arrays;

import java.util.Arrays;

public class PushZero
{
	//int a[]= {45,0,30,23,0,78,90,0,12};
	public static int[] pushZerosToFront(int a[])
	{
		int current=a.length-1;
		for(int i=a.length-1;i>=0;i--)//iterating backwards in an array
		{
			if(a[i]!=0)
			{
				a[current]=a[i];
				current--;
			}
		}
			while(current>=0)
			{
				a[current]=0;
				current--;
			}
		return a;
	}
	public static void main(String[] args)
	{
		int a[]= {45,0,30,23,0,78,0,90,0,12,0};
		System.out.println(Arrays.toString(PushZero.pushZerosToFront(a)));
	}
}
