package Arrays;

import java.util.Arrays;

public class MaxArray
{
	//int a[]= {45,30,23,78,90,12,100};
	public static int findingMax(int a[])
	{
		int max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}
	public static void main(String[] args)
	{
		int a[]= {45,30,23,78,90,12,100};
		System.out.println(MaxArray.findingMax(a));
	}
}
