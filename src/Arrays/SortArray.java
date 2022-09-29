package Arrays;
import java.util.Arrays;
//Bubble sort
public class SortArray
{
	public static int[] sorting(int a[])
	{
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if (a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}
	public static void main(String[] args)
	{
		int a[]= {45,2,30,13,23,78,90,12,5};
		System.out.println(Arrays.toString(SortArray.sorting(a)));
	}
}
