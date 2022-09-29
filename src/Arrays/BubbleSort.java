package Arrays;
//sorting string and integer arrays using bubblesort
public class BubbleSort
{
	public static void main(String[] args)
	{
		int a[]= {45,2,30,13,23,78,90,12,5};
		String[] s= {"Neelam", "Anil", "Khushi", "Anshul"};
		int temp;
		String temp1;
		for(int i=0;i<a.length;i++)    //int array sorting
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
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		//------------------------------------------
		for(int i=0;i<s.length;i++)   //string array sorting
		{
			for(int j=0;j<s.length-1;j++)
			{
				if (s[j].compareTo(s[j+1]) > 0)
				{
					temp1=s[j];
					s[j]=s[j+1];
					s[j+1]=temp1;
				}
			}
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i] + " ");
		}
	}
}
