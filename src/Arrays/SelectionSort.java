package Arrays;
//sorting string and integer arrays using selectionsort
public class SelectionSort
{
	public static void main(String[] args)
	{
		int a[]= {45,2,30,13,23,78,90,12,5};
		String[] s= {"Neelam", "Anil", "Khushi", "Anshul"};
		int min;
		int temp=0;
		String temp1;
		for(int i=0;i<a.length;i++)    //int array sorting
		{
			min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if (a[j]<a[min])
				{
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		//------------------------------------------
		for(int i=0;i<s.length;i++)    //string array sorting
		{
			min=i;
			for(int j=i+1;j<s.length;j++)
			{
				if (s[j].compareTo(s[min]) < 0)
				{
					min=j;
				}
			}
			temp1=s[i];
			s[i]=s[min];
			s[min]=temp1;
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i] + " ");
		}
	}
	
}
